package hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DishesStreams {
    private String name;
    private String color;
    private int prise;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public DishesStreams(String name, String color, int prise) {
        this.name = name;
        this.color = color;
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "DishesStreams{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", prise=" + prise +
                '}';
    }

    public static void main(String[] args) {
        DishesStreams dish1 = new DishesStreams("Cup", "Black", 60);
        DishesStreams dish2 = new DishesStreams("Plate", "White", 90);
        DishesStreams dish3 = new DishesStreams("Glass", "Green", 40);
        DishesStreams dish4 = new DishesStreams("Bowl", "Blue", 250);
        DishesStreams dish5 = new DishesStreams("Cover", "Yellow", 120);
        DishesStreams dish6 = new DishesStreams("Cup", "White", 50);

        //List<DishesStreams> dishesStreams = List.of(dish1,dish2);

      List<DishesStreams> dishesStreams = new ArrayList<>();
        dishesStreams.add(dish1);
        dishesStreams.add(dish2);
        dishesStreams.add(dish3);
        dishesStreams.add(dish4);
        dishesStreams.add(dish5);
        dishesStreams.add(dish6);



        //List<DishesStreams> dishesStreamsUpd = dishesStreams.stream().filter(DishesStreams -> DishesStreams.getName() & DishesStreams.getPrise() <100).collect(Collectors.toList());
        //System.out.println(dishesStreams);


            System.out.println("Test 1");
            dishesStreams.stream()
                    .forEach(System.out::println);

//        System.out.println("Test 2");
//        dishesStreams.stream()
//                .filter(dishesStreams -> (dishesStreams.get() < 100))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
        }
    }

