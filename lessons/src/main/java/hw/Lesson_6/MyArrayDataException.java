package hw.Lesson_6;

public class MyArrayDataException extends Exception {
    public int i;
    public int j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }

}
