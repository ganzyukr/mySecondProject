package hw6;

public class MinArrayValue {
    public int minDifference(int[] input) {

        int finalDifference = Math.abs(input[0] - input[1]);
        int difference = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                difference = Math.abs(input[i] - input[j]);
                if (finalDifference > difference) {
                    finalDifference = difference;
                }
            }
        }
        return (finalDifference);
    }

    public static void main(String[] args) {
        // Мінімальна різниця між числами в масиві
        MinArrayValue minArrayValue = new MinArrayValue();
        int[] inputData = {5, 11, 7, 20};

        System.out.println("Мінімальна різниця між числами в масиві: " + minArrayValue.minDifference(inputData));
    }
}
