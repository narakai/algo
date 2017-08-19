package com.company.sort;

//时间复杂度为O(N log N ), 使用了等长的辅助数组，空间复杂度为O(N)
//将两个有序对数组归并成一个更大的有序数组。通常做法为递归排序，并将两个不同的有序数组归并到第三个数组中。
//        先来看看动图，归并排序是一种典型的分治应用


//“快排的实现我们可以发现其与『归并排序』的区别主要有如下两点：
//
//归并排序将数组分成两个子数组分别排序，并将有序的子数组归并以将整个数组排序。递归调用发生在处理整个数组之前。
//快速排序将一个数组分成两个子数组并对这两个子数组独立地排序，两个子数组有序时整个数组也就有序了。递归调用发生在处理整个数组之后。”

public class MergeSort {
    public static void main(String[] args) {
        int unsortedArray[] = new int[]{6, 5, 3, 1, 8, 7, 2, 4};
        mergeSort(unsortedArray);
        System.out.println("After sort: ");
        for (int item : unsortedArray) {
            System.out.print(item + " ");
        }
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int[] helper = new int[array.length];
        // copy array to helper
        System.arraycopy(array, low, helper, low, high + 1 - low);
        // merge array[low...mid] and array[mid + 1...high]
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            // k means current location
            if (i > mid) {
                // no item in left part
                array[k] = helper[j];
                j++;
            } else if (j > high) {
                // no item in right part
                array[k] = helper[i];
                i++;
            } else if (helper[i] > helper[j]) {
                // get smaller item in the right side
                array[k] = helper[j];
                j++;
            } else {
                // get smaller item in the left side
                array[k] = helper[i];
                i++;
            }
        }
    }

    //6, 5, 3, 1, 8, 7, 2, 4
    public static void sort(int[] array, int low, int high) { if (high <= low) return;
        int mid = low + (high - low) / 2;
        //二路归并排序里面有两个Sort，多路归并排序里面写多个Sort就可以了
        sort(array, low, mid);
        sort(array, mid + 1, high);
        merge(array, low, mid, high);
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] array) {
        sort(array, 0, array.length - 1);
    }
}
