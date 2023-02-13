package hw5.num1;

public class Student {

    private String name;
    private int course;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
//        String name = getName().length();    // заборона довжини більше 3 символів (не змогла вирішити цю умову)
//        if (getName().length() > 3) {
//        System.out.println("Ім'я має бути більше за  3 символи");
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course1) {
        if (course1 > 0 && course1 < 4) {    //надаємо заборону надавання від'ємного значення та > 4 (1 варіант)
            course = course1;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 10) {     //надаємо заборону надавання від'ємного значення та > 10 (2 варіант)
            this.grade = grade;
        }
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name + "; Курс: " + course + "; Оцінка: " + grade);

    }
}

