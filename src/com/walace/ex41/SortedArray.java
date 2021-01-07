package com.walace.ex41;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];

        System.out.println("Please enter " + size + " integer numbers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element " + i + " contents " + arr[i]);
    }

    public static int[] sortIntegers(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int temp = arr[i];

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > temp) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                    temp = arr[i];
                }
            }
        }

        return arr;
    }
}
