package com.company.Sorting.CycleSort.InterviewQuestions;
//LeetCode Question Link -
//https://www.leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Question -
//Given an array that contains numbers from 1 to N. Find all the numbers that are missing from the array.
//Use List<Integer> to return all the missing values.
import java.util.ArrayList;
import java.util.List;

public class Find_all_Disappeared_Numbers {
    public static void main(String[] args) {
        int[] arr = {4,2,3,2,7,3,1};
        System.out.println(disappearedNums(arr));
    }
    public static List<Integer> disappearedNums(int[] arr){
        int i = 0;
        //sorting the array
        while (i<arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }

        //returning all the missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1){
                ans.add(index + 1);
            }
        }
        return ans;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
