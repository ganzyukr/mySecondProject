package hw5.num2;

public class Pet extends Animal {

    String name;
    int tail = 1; // В завданні є, але не використовується. Можна видалити.
    int paw = 4;


    public Pet(String name) {
        this.name = name;
    }

    Pet(int eyes) {
        super(eyes);
    }

    public Pet() {
    }

    public void run() {

        System.out.println("Pet runs");
    }

    void jump() {

        System.out.println("Pet runs jumps");
    }

    public static void main(String[] args) {
        Pet pet = new Pet(2);
        pet.setView("I am pet");
        System.out.println("Who are you? - " + pet.getView());
        pet.run();
        pet.jump();
    }

}
