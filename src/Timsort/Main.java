package src.Timsort;

import src.Timsort.Sorting;
import src.Timsort.Timsort;

public class Main {
    static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Sorting timsort = new Timsort();
        int[] massiv = new int[]{123123,213,123212,-132,213};
        timsort.sort(massiv, massiv.length);
        printArray(massiv);

    }
}
