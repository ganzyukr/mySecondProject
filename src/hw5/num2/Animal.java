package hw5.num2;

public class Animal {


    int eyes;
    String view;



    //    void view(){
//        System.out.println("I am animal");
//    }
    void eat(){
        System.out.println("Animal eats");
    }
    void drink(){
        System.out.println("Animal drinks");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.drink();
        animal.view = "I am animal";
    }
}
