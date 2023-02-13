package hw5.num2;

public class Animal {

    int eyes;
    String view;

    public Animal(int eyes) {
        this.eyes = eyes;
    }

    public Animal() {
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    void eat() {

        System.out.println("Animal eats");
    }

    void drink() {

        System.out.println("Animal drinks");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setView("I am animal");
        System.out.println("Who are you? - " + animal.getView());
        animal.eat();
        animal.drink();
    }
}
