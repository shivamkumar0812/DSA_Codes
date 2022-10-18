package com.company.Searching.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {34, 20, 10, 38, 85, 45, 59, 90};
        int target = 85;
        int ans = linearSearch(arr, target, 2, 6);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target, int start,int end){
        //if array is empty then we simply return -1.
        if (arr.length == 0){
            return -1;
        }

        //this for loop will find the index at which the target element is situated.
        for (int index = start; index <= end; index++){
            if (arr[index] == target){
                return index;
            }
        }
        //if element is not found or array is empty then below line will execute.
        //it will returned and function will get ended.
        return -1;
    }
}
