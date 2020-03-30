package KompjuterIya.HomeWork260320;

public class Max_min {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {3, 12, 5, 7, 10, 17, 8, 2, 15, 4};
        int maxNumber = 0;
        int minNumber = 0;
        int buffer;
        int sumOfNumbers = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {

                if (arrayOfNumbers[j] < arrayOfNumbers[i]) {
                    buffer = arrayOfNumbers[i];
                    arrayOfNumbers[i] = arrayOfNumbers[j];
                    arrayOfNumbers[j] = buffer;
                }
            }
            minNumber = arrayOfNumbers[0];
            maxNumber = arrayOfNumbers[arrayOfNumbers.length - 1];
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
        System.out.println();
        System.out.println("Maximum element is: " + maxNumber);
        System.out.println("Minimum element is: " + minNumber);

        for (int i = 1; i < arrayOfNumbers.length - 1; i++) {
            sumOfNumbers += arrayOfNumbers[i];
        }
        System.out.println("Sum of array elements is: " + sumOfNumbers);
    }
}
