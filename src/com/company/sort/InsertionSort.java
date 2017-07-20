package com.company.sort;

/**
 * Created by laileon on 2017/7/20.
 */
//核心：通过构建有序序列，对于未排序序列，在已排序序列中从后向前扫描(对于单向链表则只能从前往后遍历)，
//        找到相应位置并插入。实现上通常使用in-place排序(需用到O(1)的额外空间)
public class InsertionSort {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{5,6,2,7,9,0,11};
        insertionSort(unsortedArray);
        System.out.println("After sort: ");
        for (int item : unsortedArray){
            System.out.println(item + " ");
        }
    }

    private static void insertionSort(int[] unsortedArray) {

    }
}
