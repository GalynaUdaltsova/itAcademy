package task_at_1_3_add;

import task_at_1_3.OperationSign;
import task_at_1_3_add.operators.IOperator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperationExecutor {

    public static final String FIRST_NUMBER_MESSAGE = "Enter first number";
    public static final String SECOND_NUMBER_MESSAGE = "Enter second number";
    public static final String OPERATION_MESSAGE = "Enter the mathematical operation: +, -, *, /, %";
    public static final String ZERO_DIVISION_ERROR_MESSAGE = "Zero division is forbidden, please enter second number again.";
    public static final String WRONG_NUMBER_ERROR_MESSAGE = "Please enter correct number";

    public static void executeOperation() {
        double firstNumber = getNumberFromUser(FIRST_NUMBER_MESSAGE);
        double secondNumber = getNumberFromUser(SECOND_NUMBER_MESSAGE);
        IOperator operator = defineOperator();
        if (OperationSign.DIVIDE == operator.getSupportedOperation() && secondNumber == 0) {
            while (secondNumber == 0) {
                secondNumber = getNumberFromUser(ZERO_DIVISION_ERROR_MESSAGE);
            }
        }
        operator.executeOperation(firstNumber, secondNumber);
    }

    private static double getNumberFromUser(String message) {
        System.out.println(message);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(WRONG_NUMBER_ERROR_MESSAGE);
            }
        }
    }

    private static IOperator defineOperator() {
        OperatorsFactory operatorsFactory = new OperatorsFactory();
        IOperator operator = null;
        System.out.println(OPERATION_MESSAGE);
        while (operator == null) {
            Scanner scanner = new Scanner(System.in);
            String operationTitle = scanner.next();
            OperationSign operationSign = OperationSign.fromTitle(operationTitle);
            operator = operatorsFactory.getNullableOperator(operationSign);
        }
        return operator;
    }
}
