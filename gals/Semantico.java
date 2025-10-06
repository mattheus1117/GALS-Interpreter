package gals;
import java.util.*;


public class Semantico implements Constants {
    Map<String, Integer> tabelaVariaveis = new HashMap<String, Integer>();
    Stack<List<Integer>> operandoAnterior = new Stack<>();
    Stack<List<String>> operandorAnterior = new Stack<>();
    List<Integer> operandoAtual = new ArrayList<>();
    List<String> operandorAtual = new ArrayList<>();
    String variavelAtual;




    public void executeAction(int action, Token token)	throws SemanticError {
        switch (action) {

            case 1:
                if (!tabelaVariaveis.containsKey(variavelAtual))
                    throw new SemanticError("Tentativa de print de variável não definida: " + variavelAtual);
                System.out.println(variavelAtual + " = " + Integer.toBinaryString(tabelaVariaveis.get(variavelAtual)));
                break;



            case 2:
                variavelAtual = token.getLexeme();
                break;



            case 3:
                if (!operandoAnterior.isEmpty()){
                    throw new SemanticError("Expressão incompleta: pârenteses não foram fechados");
                }


                resolverExpressao(operandoAtual, operandorAtual);
                tabelaVariaveis.put(variavelAtual, operandoAtual.get(0));


                operandoAtual.clear();
                operandorAtual.clear();
                break;
            


            case 4:
                adicionarOperador(token.getLexeme());
                break;



            case 5:
                addOperand(Integer.parseInt(token.getLexeme(),2 ));
                break;
            


            case 6:
                Integer value = tabelaVariaveis.get(token.getLexeme());
                if (value == null) {
                    throw new SemanticError("Variável '" + token.getLexeme() + "' não definida.");
                }


                addOperand(value);
                break;



            case 7:
                operandoAnterior.push(operandoAtual);
                operandorAnterior.push(operandorAtual);
                operandoAtual = new ArrayList<>();
                operandorAtual = new ArrayList<>();
                break;



            case 8:
                resolverExpressao(operandoAtual, operandorAtual);
                Integer parenthesesResult = operandoAtual.get(0);


                List<Integer> previousoperandoAtual = operandoAnterior.pop();
                List<String> previousoperandorAtual = operandorAnterior.pop();


                previousoperandoAtual.add(parenthesesResult);
                operandoAtual = previousoperandoAtual;
                operandorAtual = previousoperandorAtual;
                break;



            default:
            throw new SemanticError("Ação semântica #" + action + " nao encontrada para token: " + token.getLexeme());
        }
    }


    private void adicionarOperador(String operator) {
        operandorAtual.add(operator);
    }


    private void addOperand(Integer operand) {
        operandoAtual.add(operand);
    }


    private void resolverExpressao(List<Integer> operandoAtual, List<String> operandorAtual) throws SemanticError {
        resolverOperador(Arrays.asList("log"), operandoAtual, operandorAtual);
        resolverOperador(Arrays.asList("^"), operandoAtual, operandorAtual);
        resolverOperador(Arrays.asList("*", "/"), operandoAtual, operandorAtual);
        resolverOperador(Arrays.asList("+", "-"), operandoAtual, operandorAtual);
    }


    private void resolverOperador(List<String> targetOperators, List<Integer> operandoAtual, List<String> operandorAtual) throws SemanticError  {
        for (int i = 0; i < operandorAtual.size(); i++) {
            String operator = operandorAtual.get(i);

            if (targetOperators.contains(operator)) {
                Integer num1 = operandoAtual.get(i);
                Integer num2;

                if (!operator.equals("log")) {
                    num2 = operandoAtual.get(i + 1);
                } else {
                    num2 = null;
                }
                
                Integer result = null;

                switch (operator) {
                    case "^":
                        result = (int) Math.pow(num1, num2);
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            throw new ArithmeticException("Divisão por zero na operação " + num1 + " / " + num2);
                        }
                        result = num1 / num2;
                        break;
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "log":
                        if (num1 <= 0) {
                            throw new ArithmeticException("Logaritmo de número não positivo: " + num1);
                        }
                        result = (int) Math.log10(num1);
                        operandoAtual.set(i, result);

                        operandorAtual.remove(i);
                        continue;
                }
                operandoAtual.set(i, result);
                
                if (result < 0) {
                    throw new SemanticError("Resultado negativo não permitido: " + result);
                }

                operandoAtual.remove(i + 1);
                operandorAtual.remove(i);
                i--;
            }
        }
    }
}