package com.walace.ex43;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] arr) {
        int temp;
        int[] arrBkp = new int[arr.length];
        System.arraycopy(arr, 0, arrBkp, 0, arrBkp.length);

        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println("Array = " + Arrays.toString(arrBkp));
        System.out.println("Reversed array = " + Arrays.toString(arr));
    }
}
