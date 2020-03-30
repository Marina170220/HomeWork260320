package KompjuterIya.HomeWork260320;

public class MaxNegative {
    public static void main(String[] args) {

        int[] arrayOfNumbers = {1, 5, -7, 0, 8, 12, 85, -8, 3, 7, 11, -9, 5, 100, -20, 15, -50, 10};
        int maximumNegativeElement = arrayOfNumbers[0];
        int indexOfMaximumNegativeElement = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 1; j < arrayOfNumbers.length - 1; j++) {
                if (arrayOfNumbers[i] < 0 && Math.abs(arrayOfNumbers[i]) > arrayOfNumbers[j]) {
                    maximumNegativeElement = arrayOfNumbers[i];
                    indexOfMaximumNegativeElement = i;
                }
            }
        }
        System.out.println("Maximum negative element is " + maximumNegativeElement);
        System.out.println("Index of a maximum negative element is " + indexOfMaximumNegativeElement);
    }
}
