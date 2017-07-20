package com.company.sort;

/**
 * Created by laileon on 2017/7/20.
 */
public class Utils {
    public static void swap(int i, int j, int[] unsortedArray){
        int temp = unsortedArray[i];
        unsortedArray[i] = unsortedArray[j];
        unsortedArray[j] = temp;
    }
}
