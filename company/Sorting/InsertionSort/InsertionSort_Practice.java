package com.company.Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort_Practice {
    public static void main(String[] args) {
        int[] arr = {-5,2,0,5,-1,7};
        sortInsertion(arr);
        System.out.println(Arrays.toString(arr));
    }
   static void sortInsertion(int[] arr){
        //running the loop from 0 to n-1
       for (int i = 0; i< arr.length -1; i++){
           //selecting ith element and inserting it in its correct place
           for (int j = i+1; j>0; j--){
               if (arr[j] < arr[j-1]){
                   swap(arr, j, j-1);
               }
           }
       }
   }
   static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
   }
}
