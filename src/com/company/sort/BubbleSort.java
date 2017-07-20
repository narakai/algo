package com.company.sort;

/**
 * Created by laileon on 2017/7/20.
 */

//核心：冒泡，持续比较相邻元素，大的挪到后面，因此 {大的会逐步往后挪}，故称之为冒泡。
//时间：平均最坏O(n2)，空间O(1)
public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{5,6,2,7,9,0,1};
        bubblesort(unsortedArray);
        System.out.println("After sort: ");
        for (int item : unsortedArray){
            System.out.println(item + " ");
        }
    }

    private static void bubblesort(int[] unsortedArray) {
        int len = unsortedArray.length;
        for (int i = 0; i < len; i++) {
            //运行一次后最大的被挪到最后
            for (int j = 1; j < len - i; j++) {
                if (unsortedArray[j - 1] > unsortedArray[j]){
                    Utils.swap(j - 1, j, unsortedArray);
                }
            }
        }
    }
}
