package KompjuterIya.HomeWork260320;

public class Unique {
    public static void main(String[] args) {
        int[] firstArray = {5, 7, 2, 8, 7, 1, 3, 4, 5, 9, 2, 1};
        int buffer;

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = i + 1; j < firstArray.length; j++) {
                if (firstArray[j] < firstArray[i]) {
                    buffer = firstArray[i];
                    firstArray[i] = firstArray[j];
                    firstArray[j] = buffer;
                }
            }
        }
        System.out.print("Array sorted ascending: ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        System.out.print("Unique elements: ");

        for (int i = 1; i < firstArray.length - 1; i++) {
            if (firstArray[i] != firstArray[i + 1] && firstArray[i] != firstArray[i - 1]) {
                System.out.print(firstArray[i] + " ");
            }
        }
    }


}


