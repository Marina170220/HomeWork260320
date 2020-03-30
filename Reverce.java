package KompjuterIya.HomeWork260320;

public class Reverce {
    public static void main(String[] args) {

        int[] arrayOfNumbers = {1, 7, 12, 3, 8, 10, 5, 9, 20};
        int buffer;

        for (int i = 0; i < arrayOfNumbers.length / 2; i++) {
            buffer = arrayOfNumbers[i];
            arrayOfNumbers[i] = arrayOfNumbers[(arrayOfNumbers.length - 1) - i];
            arrayOfNumbers[(arrayOfNumbers.length - 1) - i] = buffer;
        }

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }
}


