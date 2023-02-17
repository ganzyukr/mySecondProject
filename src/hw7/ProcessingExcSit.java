package hw7;

import java.util.Arrays;

public class ProcessingExcSit {

    public static class ArrayDividing {
        public void dividerArr(int[] arr, int divider) {
            int[] output = new int[arr.length];
            try {
                for (int i = 0; i < arr.length; i++) {
                    output[i] = arr[i] / divider;
                }
                System.out.println(Arrays.toString(output));
            } catch (ArithmeticException e) {
                System.out.print(e);
                //System.out.println(e.getMessage()); - інший метод виводу на екран обробки виключення
                //e.getStackTrace(); - інший метод виводу на екран обробки виключення
            }
        }
    }
    public static void main(String args[]) {
        int[] array = {4, 9, 6, 8};
        int dividerNum = 2;
        ArrayDividing arrayDividing = new ArrayDividing();
        arrayDividing.dividerArr(array, dividerNum);
    }
}
