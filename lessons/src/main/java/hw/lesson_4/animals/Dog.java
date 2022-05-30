package hw.lesson_4.animals;

public class Dog extends Animal {

    private final int MAX_RUN = 500;
    private final int MAX_SWIM = 10;

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int n) {
        if (n < MAX_RUN) {
            System.out.println(name + " пробежал(a) " + n + "m");
        } else {
            System.out.println("Собаки столько не бегают!");

        }
    }

    @Override
    public void swim(int n) {
        if (n < MAX_SWIM) {
            System.out.println(name + " проплыл(a) " + n + "m");
        } else {
            System.out.println("Собаки столько не плавают!");

        }
    }
}
