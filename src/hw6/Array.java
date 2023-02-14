package hw6;

import java.util.Arrays;
import java.util.Comparator;

public class Array {
    public static void main(String[] args) {


    int[] array = {5, 11, 7, 20};

        int min = 0, max = 0;

        for (int i = 0; i < array.length; ++i) {
            if (array[i] < array[min]) {
                min = i;
            }
            if (array[i] > array[max]) {
                max = i;
            }
        }

        int left = (min < max) ? min : max;
        int right = (min < max) ? max : min;

        for (int i = left + 1; i < right; ++i) {
            System.out.print(array[i] + " ");
        }

//    Arrays.sort(array);
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//
//        int max = Arrays.stream(array).max().getAsInt();
//        int min = Arrays.stream(array).min().getAsInt();
//        System.out.println(max - min);


//            .stream(array)
//            .flatMap(array -> Arrays.stream(array).map(otherElement -> otherElement - element))
//            .filter(e -> e > 0)
//            .min(Comparator.naturalOrder())
//            .ifPresent(System.out::println);

    //for (int i = 0; i < list.size() - 2; i++) { int diff = list[i + 1] - list[i]; if (bestDiff > diff) { /* что делаем тут? */ } }
}
}
