package com.walace.ex42;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int num) {
        int[] arr = new int[num];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        return min;
    }
}
