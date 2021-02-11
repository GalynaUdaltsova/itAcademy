package task_at_1_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOperator {

    public static final String FIRST_NUMBER_MESSAGE = "Enter first number";
    public static final String SECOND_NUMBER_MESSAGE = "Enter second number";
    public static final String OPERATION_MESSAGE = "Enter the mathematical operation:\n +\n -\n *\n /\n %";
    public static final String ZERO_DIVISION_ERROR_MESSAGE = "Zero division is forbidden, please enter second number again.";
    public static final String WRONG_NUMBER_ERROR_MESSAGE = "Please enter correct number";

    public static void executeMathematicalOperations() {
        double firstNumber = getNumberFromUser(FIRST_NUMBER_MESSAGE);
        double secondNumber = getNumberFromUser(SECOND_NUMBER_MESSAGE);
        OperationSign operationSign = getOperationSign();
        if (operationSign == OperationSign.DIVIDE && secondNumber == 0) {
            while (secondNumber == 0) {
                secondNumber = getNumberFromUser(ZERO_DIVISION_ERROR_MESSAGE);
            }
        }
        switch (operationSign) {
            case PLUS:
                System.out.println(firstNumber + secondNumber);
                break;
            case MINUS:
                System.out.println(firstNumber - secondNumber);
                break;
            case MULTIPLY:
                System.out.println(firstNumber * secondNumber);
                break;
            case DIVIDE:
                System.out.println(firstNumber / secondNumber);
                break;
            case MODULO:
                System.out.println(firstNumber % secondNumber);
                break;
            default:
                System.out.println(String.format("You enter incorrect mathematical operation: %s", operationSign));
        }
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
    private static OperationSign getOperationSign() {
        System.out.println(NumberOperator.OPERATION_MESSAGE);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String operator = scanner.next();
            OperationSign operationSign = OperationSign.fromTitle(operator);
            if(operationSign != null) {
                return operationSign;
            }
            System.out.println("You entered unsupported operation, please try again");
        }
    }
}
