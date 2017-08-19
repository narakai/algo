package com.company.sort;

/**
 * Created by laileon on 2017/7/20.
 */
//核心：通过构建有序序列，对于未排序序列，在已排序序列中从后向前扫描(对于单向链表则只能从前往后遍历)，
//        找到相应位置并插入。实现上通常使用in-place排序(需用到O(1)的额外空间)

//    “核心：基于插入排序，使数组中任意间隔为h的元素都是有序的，即将全部元素分为h个区域使用插入排序。
//            其实现可类似于插入排序但使用不同增量。更高效的原因是它权衡了子数组的规模和有序性。

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
        int len = unsortedArray.length;
        for (int i = 0; i < len; i++) {
            //右边将作比较的数
//            int temp = unsortedArray[i];
            while (i > 0 && unsortedArray[i - 1] > unsortedArray[i]){
                Utils.swap(i - 1, i, unsortedArray);
                i --;
            }
//            unsortedArray[i] = temp;
        }
    }
}
