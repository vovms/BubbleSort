package main_package;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {5, 1, 4, 2, 8};
        printArray(array);
        bubbleSort(array);
        printArray(array);

    }

    public static void bubbleSort(int[] array) {

        boolean isReady = false;
        int count = 0;
        while (!isReady) {
            isReady = true;
            count++;
            for (int i = 0; i < array.length - 1; i++) {
                int t = array[i];
                if (array[i] > array[i + 1]) {
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    isReady = false;
                }
            }
        }

        System.out.println("Count = " + count);
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

}
