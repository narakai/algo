package com.company.sort;

/**
 * Created by laileon on 2017/7/20.
 */
//核心：不断地选择剩余元素中的最小者。
//
//        找到数组中最小元素并将其和数组第一个元素交换位置。
//        在剩下的元素中找到最小元素并将其与数组第二个元素交换，直至整个数组排序。
//        性质：
//
//        比较次数=(N-1)+(N-2)+(N-3)+...+2+1~N^2/2
//        交换次数=N
//        运行时间与输入无关

public class SelectionSort {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{5,6,2,7,9,0,11};
        selectionSort(unsortedArray);
        System.out.println("After sort: ");
        for (int item : unsortedArray){
            System.out.println(item + " ");
        }
    }

    private static void selectionSort(int[] unsortedArray) {
        int len = unsortedArray.length;
        for (int i = 0; i < len; i++) {
            //每次最小的index经转换后一定为最前
            int min_index = i;
            for (int j = i + 1; j < len; j++) {
                if (unsortedArray[j] < unsortedArray[min_index]) {
                    min_index = j;
                }
            }
            Utils.swap(min_index, i, unsortedArray);
        }
    }
}
