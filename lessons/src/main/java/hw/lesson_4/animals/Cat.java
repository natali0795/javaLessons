package hw.lesson_4.animals;

public class Cat extends Animal {

    private final int MAX_RUN = 200;
    private final int MAX_SWIM = 0;

    private String name;
    private int eat_norm = 10;
    private boolean hungry = true;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int eat_norm) {
        this.name = name;
        this.eat_norm = eat_norm;
    }

    @Override
    public void run(int n) {
        if (n < MAX_RUN) {
            System.out.println(name + " пробежал(a) " + n + "m");
        } else {
            System.out.println("Коты столько не бегают!");

        }
    }

    @Override
    public void swim(int n) {
        System.out.println("Коты не умеют плавать");
    }


    public int eat(int n) {

        if (n < eat_norm) {
            return n;
        }
        this.hungry = false;
        return n - eat_norm;
    }

    public boolean getHungry() {
        return hungry;
    }
}
