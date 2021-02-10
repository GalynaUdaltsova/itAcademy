package task_at_1_1;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayOperator {
    public static void fillArrayWithData() {
        int[] arrayOfRandomNumbers = new int[50];

        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(-100, 100);
            arrayOfRandomNumbers[i] = randomNumber;
            System.out.print(randomNumber + " ");
        }
        System.out.println();

        for (int i = 0; i < arrayOfRandomNumbers.length; i++) {
            if (arrayOfRandomNumbers[i] < 0) {
                arrayOfRandomNumbers[i] = 0;
            }
            System.out.print(arrayOfRandomNumbers[i] + " ");
        }
    }
}
