package hw7;

import java.util.Arrays;

public class ProcessingExcSit {
    public static void main(String args[]) {
        int[] arr = {4, 9, 6, 8};
        int mul = 2;
        int[] output = new int[arr.length];
        try {
            for (int i = 0; i < arr.length; i++) {
                output[i] = arr[i] / mul;
            }
            System.out.println(Arrays.toString(output));
        } catch (ArithmeticException e) {
            System.out.print("Message: " + e);
        }

    }
}


//        try {
//            for (int i = 0; i < arr.length; i++) {
//
//                int mul = 0;
//                {
//
//                    // Цикл множення значень масиву
//                    for (int j = 0; j < arr.length; j++)
//                        output[i] = arr[i] / mul;
//
//                }
//            }
//        } catch (Exception e)
//            System.out.print(Arrays.toString(output));
//        }



