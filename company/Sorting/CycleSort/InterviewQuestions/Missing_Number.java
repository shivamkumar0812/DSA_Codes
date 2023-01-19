package com.company.Sorting.CycleSort.InterviewQuestions;
//Leetcode Question Link-
//https://leetcode.com/problems/missing-number/
//Question -
//Given an array nums containing n distinct numbers in the range [0,n].
// return only the number from the range that is missing from the array
public class Missing_Number {
    public static void main(String[] args) {
    int arr[] = {4,0,2,1};
    int ans = findMissingNumber(arr);
        System.out.println("Missing number is "+ans);
    }
    public static int findMissingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            //if element is smaller than n and element is not present at correct index then swap
            // else increase i.
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }

        //search for missing number and return if element is not present at its correct index.
        for (int index = 0; index<arr.length; index++){
            if (arr[index] != index){
                return index;
            }

        }
    //if all elements are present at correct index then return n.
    return arr.length;
    }

    //Swap Method
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
