package hw;


import hw.lesson_5.Apple;
import hw.lesson_5.Orange;
import hw.lesson_5.Box;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        // Задача 1. Написать метод, который меняет два элемента массива местами.
        // (массив может быть любого ссылочного типа);
        String[] arr = {"a", "b", "c", "125"};


        System.out.println("Задача1\n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));


        //Задача 3. Коробки с фруктами
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add (new Apple());
        }
        
        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weigth);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weigth);
        System.out.println("Вес коробки с яблоками: " + appleWeigth);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));
        

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


}