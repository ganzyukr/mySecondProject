package hw4;

public class Student {

    char studentIdNumber;
    String name;
    String surname;
    int course;
    double scoreMathematics;
    double scoreEconomics;
    double scoreForeignLanguage;


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
// Дуже багато часу витратила в пошуках правильної реалізації, намагалось щось придумати сама...
// В голові тепер повна каша((
// Нижче приклади які я намагалась підкорегувати під завдання


//    public char getStudentIdNumber() {
//        return studentIdNumber;
//    }
//
//    public void setStudentIdNumber(char studentIdNumber) {
//        this.studentIdNumber = studentIdNumber;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getScoreMathematics() {
//        return scoreMathematics;
//    }
//
//    public void setScoreMathematics(double scoreMathematics) {
//        this.scoreMathematics = scoreMathematics;
//    }
//
//    public double getScoreEconomics() {
//        return scoreEconomics;
//    }
//
//    public void setScoreEconomics(double scoreEconomics) {
//        this.scoreEconomics = scoreEconomics;
//    }
//
//    public double getScoreForeignLanguage() {
//        return scoreForeignLanguage;
//    }
//
//    public void setScoreForeignLanguage(double scoreForeignLanguage) {
//        this.scoreForeignLanguage = scoreForeignLanguage;
//    }
//
//    public double getAverage() {
//        return average;
//    }
//
//    public void setAverage(double average) {
//        this.average = average;
//    }
//
//    @Override
//    public String toString() {
//        return String.format(Locale.ENGLISH,"Школа № " + name + " математика - " + "%.1f" + " русский язык - " + "%.1f" + " инфрматика - " + "%.1f" + " общий средний балл - " + "%.1f", getscoreMathematics(), getscoreEconomics(),getscoreForeignLanguage());
//    }
//}


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



