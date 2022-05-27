package hw;

import hw.lesson_4.Animal;
import hw.lesson_4.Cat;
import hw.lesson_4.Dog;
import hw.lesson_4.Plate;

public class Main {
    public static void main(String[] args) {
        Animal catMusy = new Cat("Муся");
        Animal dogTusia = new Dog("Тузя");

        catMusy.run(150);
        dogTusia.run(600);

        catMusy.swim(10);
        dogTusia.swim(5);

        Animal[] animals = new Animal[4];

        animals[0] = catMusy;
        animals[1] = dogTusia;
        animals[2] = new Cat("Мурчик");
        animals[3] = new Cat("Буся");

        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(150);
        }

        Cat[] cats = new Cat[4];

        cats[0] = new Cat("Чурныш", 50);;
        cats[1] = new Cat("Бублик", 5);;
        cats[2] = new Cat("Мурчик", 50);
        cats[3] = new Cat("Буся", 30);

        Plate plate = new Plate(50);

        meal(cats, plate);
    }


    public static void meal(Cat[] cats, Plate plate){

        for (Cat cat : cats) {
                plate.setFood(cat.eat(plate.getFood()));

                System.out.println("Кот "  +( cat.getHungry() ? " голоден":" сыт"));
            }
    }
}
