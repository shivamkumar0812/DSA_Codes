package com.company.Sorting.CycleSort.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Duplicates {
    public static void main(String[] args) {
        int[] arr = {7,3,2,4,3,8,1,2};
        List<Integer> ans = findAllDuplicate(arr);
        System.out.println(ans);

    }
    static List<Integer> findAllDuplicate (int[] arr){
        int i = 0;
        while(i< arr.length){
            int correct = i -1;
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index + 1){
                ans.add(arr[index]);
            }
        }

        
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
