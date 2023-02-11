package hw4;

public class StudentTest {




            public static void main(String[] args) {
        Student student1 = new Student('1', "Ann", "Kildina", 3, 9.6, 8.6, 10.2);
        Student student2 = new Student('2', "Alex", "Titov", 5, 9.9, 8.3, 10.3);
        Student student3 = new Student('3', "Kate", "Homenko", 4, 9.7, 8.7, 10.8);


        System.out.println(student1.average);
        System.out.println(student2.average);
        System.out.println(student3.average);

        System.out.println(student1);
    }
}

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
