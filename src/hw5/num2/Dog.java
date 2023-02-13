package hw5.num2;

public class Dog extends Pet {


    void play() {

        System.out.println("Dog plays");
    }

    Dog(String name) {
        super(name);
    }

    public Dog() {
    }

    @Override
    public void run() {   // в завданні не було, захотілось спробувати

        System.out.println("Dog runs");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Bonya");
        dog.setView("I am dog and my name is: " + dog.name);
        System.out.println(dog.getView());
        dog.play();
        dog.run();
    }
}
