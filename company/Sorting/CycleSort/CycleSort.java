package com.company.Sorting.CycleSort;

import java.util.Arrays;

public class CycleSort  {
    public static void main(String[] args) {
        int[] arr = {2,1,6,5,3,4};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void CyclicSort(int[] arr){

        int i = 0;
        while (i<arr.length - 1) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
