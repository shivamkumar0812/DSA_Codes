package com.company.Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] marks = {1, 4, 7, 9, 11, 15, 16, 20, 25, 40, 60, 70, 80,99};
        int target = 60;
        int ans = binarySearch(marks, target);
        System.out.println(ans);
    }
    //making a static function
    //it will return index if target is found.
    //else it will return -1 if the target does not exist in the array.

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
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
