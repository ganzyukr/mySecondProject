package hw4;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student('1', "Ann", "Kildina", 3, 9.0, 8.0, 10.0);
        Student student2 = new Student('2', "Alex", "Titov", 5, 8.0, 6.0, 7.0);
        Student student3 = new Student('3', "Kate", "Homenko", 4, 10.3, 9.0, 10.7);

        System.out.print("Значення середнього арифметичного student1 дорівнює: ");
        System.out.println((student1.scoreMathematics + student1.scoreEconomics + student1.scoreForeignLanguage) / 3);
        System.out.print("Значення середнього арифметичного student2 дорівнює: ");
        System.out.println((student2.scoreMathematics + student2.scoreEconomics + student2.scoreForeignLanguage) / 3);
        System.out.print("Значення середнього арифметичного student3 дорівнює: ");
        System.out.println((student3.scoreMathematics + student3.scoreEconomics + student3.scoreForeignLanguage) / 3);

    }
}

//        double[] student1 = {9.0, 8.0, 10.0};
//        double result1 = 0;
//        for (double m : student1) {
//            result1 += m;
//        }
//
//        double[] student2 = {9.7, 8.3, 10.2};
//        double result2 = 0;
//        for (double m : student2) {
//            result2 += m;
//        }
//
//        double[] student3 = {8.3, 9.0, 9.7};
//        double result3 = 0;
//        for (double m : student3) {
//            result3 += m;
//        }
//        System.out.println("Значение среднего арифметического student1 равно: " + result1 / student1.length);
//        System.out.println("Значение среднего арифметического student2 равно: " + result2 / student2.length);
//        System.out.println("Значение среднего арифметического student3 равно: " + result3 / student3.length);


//        System.out.println(student1.average);
//        System.out.println(student2.average);
//        System.out.println(student3.average);

//    public static void main(String[] args) {
//        double[] nums = {3.3, 4.4, 5.5};
//        double result = 0;
//
//        for (double d : nums) {
//            result += d;
//        }
//        System.out.println("dfdfd " + result / nums.length);
//    }


//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите размерность массива: ");
//        int lengthArray = in.nextInt();
//        int allSum = 0;
//
//        int[] myFirstArray = new int[lengthArray];
//        System.out.println("\nСумма всех элементов: "+allSum);
//        System.out.println("Среднее арифметическое всех элементов: "+allSum/lengthArray)

//    public static void main(String args[]) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("N = ");
//        int N = Integer.parseInt(reader.readLine());
//        System.out.println();
//        int sum = 0;
//        for (int i = 0; i < N; i++) sum += Integer.parseInt(reader.readLine());
//        System.out.println((double) sum / N);
