package com.company.Searching.BinarySearch.InterviewQuestions;
//Question Link -
//https://geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers

public class Infinite_Array {
    public static void main(String[] args) {
        int[] marks = {3, 5,7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int ans = ans(marks, target);
        System.out.println(ans);

    }
    static int ans(int[] arr, int target){
        //first we will find range
        //first we will start with a box size of 2.
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            //this will work like temp
            int newStart = end + 1;

            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){

        if (arr.length == 0){
            return -1;
        }


        while (start <= end) {
            // int mid = (start + end)/2;
            //this is not ideal way to initialize mid
            //because adding very large start and end value can give a number which exceeds int value;

            //so here's an optimized way to do it.
            //s + (e-s)/2 --> if we solve it then we will get ( 2s + e-s)/2 -->
            // s will cancel out and we will get (s+e)/2
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else
                return mid;
        }

        return -1;
    }
}
