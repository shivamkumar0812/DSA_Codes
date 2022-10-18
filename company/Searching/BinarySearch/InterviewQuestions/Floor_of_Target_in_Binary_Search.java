package com.company.Searching.BinarySearch.InterviewQuestions;

public class Floor_of_Target_in_Binary_Search {

        public static void main(String[] args) {
            int[] marks = {1, 4, 7, 9, 11, 15, 16,17,18, 20, 25, 40, 60, 70, 80,99};
            int target = -2;
            int ans = floor(marks, target);
            System.out.println(ans);
        }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 0){
            return -1;
        }
        else if(target < arr[arr.length -1]){
            return Integer.MAX_VALUE;
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
                return arr[mid];
        }

        return arr[end];
        //or
        //return arr[start-1];
    }
    }

