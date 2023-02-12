package hw4;

public class Employee {
    protected double salary = 15.5;
    public String surname;
    private int id;
    int age;
    String name;
    static double course = 45;

    protected Employee(){
    }
    public Employee(double salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }
    Employee(double salary, String surname, String name) {
        this.salary = salary;
        this.surname = surname;
        this.name = name;
    }
    private Employee(double salary, String surname, int age, String name) {
        this.salary = salary;
        this.surname = surname;
        this.age = age;
        this.name = name;
    }
    void showA(){
        age = 4;
        System.out.println();
}
    void showC(){
        salary = 49;
        System.out.println();
    }

    static void showSalary(){

        System.out.println("Salary is high");
    }

    static void course(){
        System.out.println(course);
    }

    public static void main(String[] args) {
    Employee emp1 = new Employee();
    emp1.salary = 20;

    showSalary();

    }
    class new1 {
        protected double salary = 15.0;
        public String surname;
        private int id;
        int age;
        String name;
        double course = 55;
        public void df(String[] args) {
            Employee emp1 = new Employee();
            emp1.salary = 20;

            showSalary();

        }
        public void fd(String[] args) {
            Employee emp1 = new Employee();
            emp1.salary = 20;

            showSalary();

        }
    }

    class new2 {
        protected double salary = 15.0;
        public String surname;
        private int id;
        int age;
        String name;
        double course = 55;
    }

}
