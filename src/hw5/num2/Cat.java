package hw5.num2;

public class Cat extends Pet {

    public Cat() {
    }

    Cat(String name) {
        super(name);
    }

    void sleep() {

        System.out.println("Cat sleeps");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Ketty");
        cat.setView("I am cat and my name is: " + cat.name);
        System.out.println(cat.getView());
        cat.sleep();
    }
}
