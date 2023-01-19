package com.company.Sorting.SelectionSort;

import java.util.Arrays;

public class SelectionSort_Practice {
    public static void main(String[] args) {
        int[] arr = {2,9,-1,6,3,0,-5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        //running the loop from starting to ending
        for (int i = 0; i< arr.length; i++){
            int last = arr.length- i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i<=end; i++){
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
