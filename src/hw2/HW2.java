package hw2;

import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {

        int a = 123;
        System.out.println("Сума цифр числа " + a + " дорівнює " + ((a % 10) + ((a / 10) % 10) + ((a / 100) % 10)));


        String Str = new String("Hello World");
        System.out.print("Довжина двох слів \"Hello World\" - ");
        System.out.println(Str.length());


        Scanner in = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int input = in.nextInt();

        if (input > 0) {
            System.out.println("true - " + "Ваше число більше нуля");
        } else if (input < 0) {
            System.out.println("false - " + "Ваше число меньше нуля");
        } else {
            System.out.println("Число равно нулю ");
        }

    }
}
