package com.company.Sorting.CycleSort;

import java.util.Arrays;

public class CycleSort_Practice {
    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1,0};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycleSort (int[] arr){
        int i = 0;
        while (i< arr.length-1){
            int correct = arr[i];
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap (int[] arr, int  first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
