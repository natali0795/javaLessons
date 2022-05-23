package hw;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        var sumNumberChecker = new SumNumberChecker();
        boolean result = sumNumberChecker.check(2, 10);

        var numberSign = new NumberSign();
        numberSign.checkSign(550);

        var parameterSing = new ParameterSing();
        boolean isNegative = parameterSing.isNumberNegative(10);

        PrintSting.print("Some text", 3);

        ///

        // 5.Заміна елементів масива
        arrayElementsChange();
        // 7.
        arrayElementsTask7();

    }

    private static void arrayElementsChange() {
        int[] arr = {0, 1, 1, 0, 1, 0, 1};
        System.out.println("Array was " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        System.out.println("Array become " + Arrays.toString(arr));
    }

    //6.
    public static void array() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Array " + Arrays.toString(arr));
    }
    //7.
    private static void arrayElementsTask7() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
}

