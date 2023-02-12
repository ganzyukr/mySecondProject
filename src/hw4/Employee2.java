package hw4;
public class Employee2 {
    public Employee2() {
    }
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Ann";
        System.out.println(employee.name);
        System.out.println(employee.course);
    }
    void showB() {
        Employee employee = new Employee();
        employee.age = 15;
        System.out.println(employee.age);
    }
    class new3 {
        protected double salary = 17.0;
        public String surname;
        private int id;
        int age;
        String name;
        double course = 65;

        public void main(String[] args) {
            Employee employee = new Employee();
            employee.name = "Alex";
            System.out.println(employee.name);
            System.out.println(employee.course);


        }
        class Empl extends Employee {
            @Override
            void showC() {
                super.showC();
            }
        }
    }
}
