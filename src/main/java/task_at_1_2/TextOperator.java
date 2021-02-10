package task_at_1_2;


import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TextOperator {

    public static final String NUMBER_OF_LINES_MESSAGE = "Enter the correct positive number of lines";
    public static final String WRONG_NUMBER_FORMAT_ERROR_MESSAGE = "You entered the wrong number format, please try again";
    public static final String VALUE_OF_LINE_MESSAGE = "Enter the value of line";

    public static void calculateTheAverageLengthOfLines() {
        System.out.println(NUMBER_OF_LINES_MESSAGE);
        Scanner scanNumber;
        int numberOfLines = 0;
        while (numberOfLines <= 0) {
            scanNumber = new Scanner(System.in);
            try {
                numberOfLines = scanNumber.nextInt();
                if (numberOfLines <= 0) {
                    System.out.println(NUMBER_OF_LINES_MESSAGE);
                }
            } catch (InputMismatchException exception) {
                System.out.println(WRONG_NUMBER_FORMAT_ERROR_MESSAGE);
            }
        }
        Scanner scanValue;
        String value;
        double averageLengthOfLines = 0;
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println(VALUE_OF_LINE_MESSAGE);
            scanValue = new Scanner(System.in);
            value = scanValue.nextLine();
            averageLengthOfLines += value.length();
        }
        double result = averageLengthOfLines / numberOfLines;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println(String.format("The average length of line %s", numberFormat.format(result)));
    }
}
