package hw5.num1;

public class TestStudent {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Alex");
        student1.setCourse(2);
        student1.setGrade(4);
        //System.out.println("Ім'я: " + student1.getName() + "; Курс: " + student1.getCourse() + "; Оцінка: " + student1.getGrade());

        student1.displayInfo();

    }
}
