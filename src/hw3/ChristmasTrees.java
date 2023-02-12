package hw3;

public class ChristmasTrees {

    public static void main(String[] args) {

        int n = 5;

// верхня частина 1-ї фігури
        for (int i = n; i >= 0; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
// нижня частина 1-ї фігури
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.print(System.lineSeparator());

//2-а фігура - прямокутний трикутник

        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("x ");
            }
            System.out.println();
        }
        System.out.print(System.lineSeparator());

//3-а фігура - прямокутний трикутник

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}

