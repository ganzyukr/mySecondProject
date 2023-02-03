package hw1;

public class MyClass {

    public static int myMethod(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        MyClass obj = new MyClass();
        int result = obj.myMethod(num1, num2);
        System.out.println("Sum is: " + result);
    }
}
