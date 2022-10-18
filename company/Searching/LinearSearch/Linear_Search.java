package com.company.Searching.LinearSearch;
public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {34, 20, 10, 38, 85, 45, 59, 90};
        int target = 45;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }


    //search in the array: return index if item found
    //otherwise if item not found return -1.
    static int linearSearch(int[] arr, int target){
        //if array is empty then we simply return -1.
    if (arr.length == 0){
        return -1;
    }

    //this for loop will find the index at which the target element is situated.
        for (int index = 0; index < arr.length; index++){
            if (arr[index] == target){
                return index;
            }
        }
        //if element is not found or array is empty then below line will execute.
        //it will returned and function will get ended.
    return -1;
    }
    //Suppose we want to find the target and then return element itself.
    static int linearSearch2(int[] arr, int target){
        //if array is empty then we simply return -1.
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }

        //this for loop will find the index at which the target element is situated.
        for (int element: arr) {
         if (element == target)  {
             return element;
         }
        }
        //if element is not found or array is empty then below line will execute.
        //it will returned and function will get ended.
        return Integer.MAX_VALUE;
    }
}
