package hw2;

import jdk.jfr.internal.tool.Main;

import java.util.Scanner;

public class HW2 {
//    public static void main(String[] args) {
//
//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        int sum = a + b + c;
//
//        System.out.println(sum);
//
//    }


        public static void main(String[] args){
            int a = 123;
            System.out.println("Сумма цифр числа " +a +" равна "+((a%10)+((a/10)%10)+((a/100)%10)));
        }
    }


