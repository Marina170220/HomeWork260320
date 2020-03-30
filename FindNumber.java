package KompjuterIya.HomeWork260320;

public class FindNumber {
    public static void main(String[] args) {

        int[] firstArray = {8, 5, 3, 4, 2, 6, 7, 1, 9, 19, 11, 12, 20, 14, 15, 16, 17, 18, 10, 13};
        int[] secondArray = {10, 2, 18, 3, 9, 20, 19, 8, 11, 13, 1, 14, 5, 4, 6, 7, 12, 15, 16};
        int deletedNumber = firstArray.length;

        for (int i = 0; i < secondArray.length; i++) {
            deletedNumber += ((i + 1) - secondArray[i]);
        }

        System.out.println(deletedNumber);
    }
}


