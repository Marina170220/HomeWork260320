package KompjuterIya.HomeWork260320;

public class Repeat {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {5, 7, 7, 1, 5, 3, 15, 1, 9, 4, 5, 13, 7, 2, 9, 2, 1, 9, 9};
        int maximumRepeatCount = 1;
        int repeatElement = arrayOfNumbers[0];
        for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
            int repeatCount = 1;
            for (int j = i + 1; j < arrayOfNumbers.length; j++)
                if (arrayOfNumbers[i] == arrayOfNumbers[j]) {
                    repeatCount++;
                    if (repeatCount > maximumRepeatCount) {
                        maximumRepeatCount = repeatCount;
                        repeatElement = arrayOfNumbers[i];
                    }
                }
        }

        System.out.println("Element " + repeatElement + " repeated " + maximumRepeatCount + " times");
    }
}




