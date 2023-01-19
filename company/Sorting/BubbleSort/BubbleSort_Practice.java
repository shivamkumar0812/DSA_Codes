package com.company.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort_Practice {
    public static void main(String[] args) {
        int arr[] = {2,-2,1,0,3,7};
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortBubble (int[] arr){
        boolean isSwapped = false;
        //running the loops for n-1  times
        for (int i = 0; i< arr.length-1;i++){
            for (int j = 1; j< arr.length - i; j++){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if (!isSwapped){
                break;
            }
        }
    }
}
