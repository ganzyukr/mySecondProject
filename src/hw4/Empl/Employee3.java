package hw4.Empl;


public class Employee3 {
    String name = "Andriy";
    int age = 43;

    public static void main(String[] args) {
        Employee3 employee3 = new Employee3();
        employee3.displayInfo();

        Employee3 andriy = new Employee3();
        andriy.displayInfo();
    }
        void displayInfo() {
        System.out.printf(name + " - " + age + "  ");




//    public static void main(String[] args) {
//        Employee employee = new Employee();
//        employee.salary = 35;
//    }
        // Доступ до protected-змінної класа з іншого пакету ЗАБОРОНЕНИЙ

    }
}
