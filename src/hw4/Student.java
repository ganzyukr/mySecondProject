package hw4;

public class Student {

    char studentIdNumber;
    String name;
    String surname;
    int course;
    double scoreMathematics;
    double scoreEconomics;
    double scoreForeignLanguage;
    static double average;


    private double rating;
    static double avgRating;





    public Student(char studentIdNumber, String name, String surname, int course, double scoreMathematics, double scoreEconomics, double scoreForeignLanguage) {



        this.studentIdNumber = studentIdNumber;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.scoreMathematics = scoreMathematics;
        this.scoreEconomics = scoreEconomics;
        this.scoreForeignLanguage = scoreForeignLanguage;
    }


}
//    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.scoreMathematics = 4.4;
//        student1.scoreForeignLanguage = 3.3;
//
//        student1.average();
//
//    }


//    public Student(double score_mathematics, double score_economics, double score_foreign_language) {
//        this.score_mathematics = score_mathematics;
//        this.score_economics = score_economics;
//        this.score_foreign_language = score_foreign_language;
//
//
//    }
//    public static void main(String[] args) {
//        Student student1 = new Student(9.7, 8.6, 10.3);


//        System.out.println(student1.average);
//        System.out.println("frvrrgr");
//        student1.average();
//
//    }


//        student1.showAverage();
//        student2.showAverage();
//        student3.showAverage();



