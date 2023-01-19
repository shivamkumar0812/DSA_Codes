package com.company.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5,1};
        SortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SortBubble(int[] arr){
        boolean isSwapped;
        //running the loop upto n-1 pass
        for (int i = 0; i<arr.length -1; i++){
            isSwapped = false;
            for (int j = 1; j<arr.length - i; j++){
                if (arr[j] < arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped){
                break;
            }
        }

    }

}
