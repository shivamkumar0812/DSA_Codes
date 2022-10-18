package com.company.Searching.BinarySearch.InterviewQuestions;
//Question Link- Hard
////https://leetcode.com/find-in-mountain-array
public class Search_in_Mountain_Array {
    public static void main(String[] args) {
        int[] mountain = {0, 1, 2, 3, 7, 8, 2, 1, 0};
        int target = 7;
        int ans = search(mountain,target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target){
        int peak = searchRange(arr);
        int firstTry = orderAgnosticSearch(arr, target, 0 , peak);

        if (firstTry != -1){
            return firstTry;
        }

        return orderAgnosticSearch(arr, target, peak+1, arr.length -1);
    }

    static int searchRange(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]){
                //we are in descending order of the array
                //so a possible answer may be end, but for best answer we will also check LHS.
                //so we will make end = mid to check LHS.
                end = mid;
                //We've not done mid -1 because we did not want to exclude end. because end may be the answer.
            }
            else {
                //We are in ascending part of the array
                // because we know that all the right elements will be greater than mid element.
                start = mid + 1;
            }
        }
        //In the end, start == end and it will point to the largest number because of the 2 checks above.
        //start and end will always try to find the largest number because of the 2 checks.
        //hence, when they are pointing to just one element then it will be the largest number.
        //more elaboration: -->  at every point of time, start and end will  be pointing to a possible answer,
        //and when there will be only 1 item remaining, it will be the best possible answer.

        return start; // we can also return end as both are equal.
    }


    static int orderAgnosticSearch(int[] arr, int target, int start, int end) {

        if (arr.length == 0) {
            return -1;
        }
        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            // int mid = (start + end)/2;
            //this is not ideal way to initialize mid
            //because adding very large start and end value can give a number which exceeds int value;

            //so here's an optimized way to do it.
            //s + (e-s)/2 --> if we solve it then we will get ( 2s + e-s)/2 -->
            // s will cancel out and we will get (s+e)/2
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                return mid;
            }
            else if (isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }

        }


        return -1;
    }
}

