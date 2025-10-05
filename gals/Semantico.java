package gals;

import java.util.*;


public class Semantico implements Constants {
    Map<String, Integer> variables = new MashMap<String, Integer>();
    Stack<List<Integer>> operandStack = new Stack<>();
    Stack<List<String>> operatorStack = new Stack<>();
    List<Integer> operandList = new ArrayList<>();
    List<Integer> operatorList = new ArrayList<>();
    String currentVariable;

    public void executeAction(int action, Token token)	throws SemanticError {
        switch (action) {
            // Print
            case 1:
                System.out.println(currentVariable + " = " + Integer.toBinaryString(variables.get(currentVariable)) + "\n" );
                break;

            // Atribuir valor da expressão à uma variável
            case 2:
                currentVariable = token.getLexeme();
                break;

            // Fim da linha
            case 3:
                if (!operandStack.isEmpty()){
                    throw new SemanticError("Expressão incompleta: pârenteses não foram fechados");
                };

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
                addOperand(Integer.parseInt(token.getLexeme(), 2));
                break;
            
            // Variáveis utilizadas nas expressões
            case 6:
                addOperand(Variables.get(token.getLexeme()));
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

                // O resultado da avalição será o primeiro (e o único) elemnto restante
                Integer parenthesesResult = operandList.get(0);

                // Restaurar as listas anteriores (camada inferior)
                List<Integer> previousOperandList = OperandStack.pop();
                List<String> previousOperatorList = OperatorStack.pop();

                // Adiciona o resultado da expressão dentro dos parênteses à lista da camada atual (inferior)
                previousOperandList.add(parenthesesResult);

                // Atualiza operandList e operatorList para apontar para a camada superior restaurada
                operandList = previousOperandList;
                operatorList = previousOperatorList;
                break;
            
            default:
            throw new SemanticError("Ação não encontrada");
        }
    }
}
