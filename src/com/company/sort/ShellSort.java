package com.company.sort;

/**
 * Created by laileon on 2017/7/21.
 */

//希尔排序对直接插入排序进行了简单的改进：它通过加大插入排序中元素之间的间隔，并在这些有间隔的元素中进行插入排序，从而使数据项大跨度地移动，
//        当这些数据项排过一趟序之后，希尔排序算法减小数据项的间隔再进行排序，依次进行下去，进行这些排序时的数据项之间的间隔被称为增量，
//        习惯上用字母h来表示这个增量。
public class ShellSort {
    public static void main(String[] args) {
        int[] unsortedArray = new int[]{5, 6, 2, 7, 9, 0, 11, 26, 53, 67, 48, 57, 13, 48, 32, 60, 50};
        shellSort(unsortedArray);
        System.out.println("After sort: ");
        for (int item : unsortedArray) {
            System.out.println(item + " ");
        }
    }

    private static void shellSort(int[] unsortedArray) {
        // 计算出最大的h值
        int h = 1;
        //常用的h序列由Knuth提出，该序列从1开始，通过如下公式产生：
        while (h <= unsortedArray.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int i = h; i < unsortedArray.length; i += h) {
                if (unsortedArray[i] < unsortedArray[i - h]) {
                    int tmp = unsortedArray[i];
                    int j = i - h;
                    while (j >= 0 && unsortedArray[j] > tmp) {
                        unsortedArray[j + h] = unsortedArray[j];
                        j -= h;
                    }
                    unsortedArray[j + h] = tmp;
                }
            }
            // 计算出下一个h值
            h = (h - 1) / 3;
        }
    }
}
