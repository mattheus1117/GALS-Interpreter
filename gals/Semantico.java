package gals;

import java.util.*;

public class Semantico implements Constants {
    Map<String, Integer> variables = new HashMap<String, Integer>();
    Stack<List<Integer>> operandStack = new Stack<>();
    Stack<List<String>> operatorStack = new Stack<>();
    List<Integer> operandList = new ArrayList<>();
    List<String> operatorList = new ArrayList<>();
    String currentVariable;

    public void executeAction(int action, Token token)	throws SemanticError {
        switch (action) {
            // Print
            case 1:
                if (!variables.containsKey(currentVariable))
                    throw new SemanticError("Tentativa de print de variável não definida: " + currentVariable);
                System.out.println(currentVariable + " = " + Integer.toBinaryString(variables.get(currentVariable)));
                break;

            // Atribuir valor da expressão à uma variável
            case 2:
                currentVariable = token.getLexeme();
                break;

            // Fim da linha
            case 3:
                if (!operandStack.isEmpty()){
                    throw new SemanticError("Expressão incompleta: pârenteses não foram fechados");
                }

                evaluateExpression(operandList, operatorList); // Avalia a expressão inteira
                variables.put(currentVariable, operandList.get(0)); // O resultado será o primeiro (e único) elemento restante

                operandList.clear(); // Limpa a lista para a próxima expressão
                operatorList.clear();
                break;
            
            // Operadores de soma, subtração, multiplicação, divisão, potenciação, logaritmo
            case 4:
                addOperator(token.getLexeme());
                break;

            // Valores numéricos utilizados na espressão
            case 5:
                addOperand(Integer.parseInt(token.getLexeme(),2 ));
                break;
            
            // Variáveis utilizadas nas expressões
            case 6:
                Integer value = variables.get(token.getLexeme());
                if (value == null) {
                    throw new SemanticError("Variável '" + token.getLexeme() + "' não definida.");
                }
                addOperand(value);
                break;
            
            // Abrir parênteses
            case 7:
                // Empilha as listas atuais e cria novas para a nova expressão
                operandStack.push(operandList);
                operatorStack.push(operatorList);
                operandList = new ArrayList<>();
                operatorList = new ArrayList<>();
                break;

            case 8:
                // Avalia a expressão dentro dos parênteses
                evaluateExpression(operandList, operatorList);

                // O resultado da avalição será o primeiro (e o único) elemento restante
                Integer parenthesesResult = operandList.get(0);

                // Restaurar as listas anteriores (camada inferior)
                List<Integer> previousOperandList = operandStack.pop();
                List<String> previousOperatorList = operatorStack.pop();

                // Adiciona o resultado da expressão dentro dos parênteses à lista da camada atual (inferior)
                previousOperandList.add(parenthesesResult);

                // Atualiza operandList e operatorList para apontar para a camada superior restaurada
                operandList = previousOperandList;
                operatorList = previousOperatorList;
                break;
            
            default:
            throw new SemanticError("Ação semântica #" + action + " nao encontrada para token: " + token.getLexeme());
        }
    }

    private void addOperator(String operator) {
        operatorList.add(operator);
    }

    private void addOperand(Integer operand) {
        operandList.add(operand);
    }

    private void evaluateExpression(List<Integer> operandList, List<String> operatorList)  throws SemanticError {
        // Prioridade de operações: log, ^, *, /, +, -
        evaluateOperator(Arrays.asList("log"), operandList, operatorList);
        evaluateOperator(Arrays.asList("^"), operandList, operatorList);
        evaluateOperator(Arrays.asList("*", "/"), operandList, operatorList);
        evaluateOperator(Arrays.asList("+", "-"), operandList, operatorList);
    }

    private void evaluateOperator(List<String> targetOperators, List<Integer> operandList, List<String> operatorList) throws SemanticError  {
        for (int i = 0; i < operatorList.size(); i++) {
            String operator = operatorList.get(i);

            if (targetOperators.contains(operator)) {
                Integer num1 = operandList.get(i);
                Integer num2 = !operator.equals("log") 
                    ? operandList.get(i + 1) 
                    : null; // O segundo operando não é necessário para o logaritmo
                Integer result = null;

                // Realisar a operação de acordo com o operador
                switch (operator) {
                    case "^":
                        // System.out.println(num1 + " ^ " + num2);
                        result = (int) Math.pow(num1, num2);
                        break;
                    case "*":
                        // System.out.println(num1 + " * " + num2);
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            throw new ArithmeticException("Divisão por zero na operação " + num1 + " / " + num2);
                        }
                        // System.out.println(num1 + " / " + num2);
                        result = num1 / num2;
                        break;
                    case "+":
                        // System.out.println(num1 + " + " + num2);
                        result = num1 + num2;
                        break;
                    case "-":
                        // System.out.println(num1 + " - " + num2);
                        result = num1 - num2;
                        break;
                    case "log":
                        if (num1 <= 0) {
                            throw new ArithmeticException("Logaritmo de número não positivo: " + num1);
                        }
                        // System.out.println("log(" + num1 + ")");
                        result = (int) Math.log10(num1);
                        // Atualiza apenas o primeiro operando, pois o logaritmo nãoi precisa de um segundo
                        operandList.set(i, result);

                        // Remove o operador processado
                        operatorList.remove(i);
                        i--; // Reajusta o índice para continuar a verificação
                        continue;
                }

                // Atualiza operandos e operadores
                operandList.set(i, result); // Substitui o primeiro operando pelo resultado
                
                if (result < 0) {
                    throw new SemanticError("Resultado negativo não permitido: " + result);
                }

                operandList.remove(i + 1); // Remove o segundo operando
                operatorList.remove(i); // Remove o operador processado
                i--; // Reajusta o índice para continuar com a verificação
            }
        }
    }
}