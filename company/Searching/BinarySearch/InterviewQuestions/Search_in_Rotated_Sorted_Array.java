package com.company.Searching.BinarySearch.InterviewQuestions;
//Question Link -
//https://leetcode.com/search-in-rotated-sorted-array

//Note- there will be no duplicate value in a rotated sorted array.
public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] rotated = {5, 6, 7, 8, 0, 1, 2};
        int target = 7;
        int ans = rotatedSortedSearch(rotated, target);
        System.out.println(ans);
    }
    //solution-
    //to find this answer we have to do 3 steps-
    //1. find pivot element.
    //2. search in first half - search(int[] arr, int target, 0, pivot)
    //3. otherwise search in second half - search(int[] arr, int target, pivot +1, arr.length -1);

    static int rotatedSortedSearch(int[] arr,int target){
        //In this method we will find the pivot element.
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        int pivot = findPivot(arr);
        int ans;
        if (pivot == -1){
             ans = orderAgnosticSearch(arr, target, 0, pivot);
            return ans;
        }
        if (arr[pivot] == target){
            return pivot;
        }
        else if (arr[start] <= target){
             ans = orderAgnosticSearch(arr, target, 0, pivot);
             return ans;
        }

        return orderAgnosticSearch(arr, target, pivot + 1, end);



    }
    //this will not work for duplicate values.
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){

            int mid = start + (end - start) / 2;
            //we will apply all the 4 cases that we have learned.

            //Case 1 -
            //in this case if the middle element is the last one then arrayOutOfBound Exception will occur.
            //because of mid+1 check.
            //so to prevent from this error we will check if mid < end or not.
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            //Case 2 -
            //in this case if the mid-1 element is the first one then arrayOutOfBound Exception will occur.
            //because of mid-1 check.
            //so to prevent from this error we will check if mid > start or not.
            else if(mid> start && arr[mid-1] > arr[mid]){
               return mid - 1;
            }
            else if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else
                start = mid + 1;

        }
        return -1;
    }
    static int orderAgnosticSearch(int[] arr, int target, int start, int end) {


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

    //this will work for duplicate values.
    static int findDuplicatePivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){

            int mid = start + (end - start) / 2;
            //we will apply all the 4 cases that we have learned.

            //Case 1 -
            //in this case if the middle element is the last one then arrayOutOfBound Exception will occur.
            //because of mid+1 check.
            //so to prevent from this error we will check if mid < end or not.
            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            //Case 2 -
            //in this case if the mid-1 element is the first one then arrayOutOfBound Exception will occur.
            //because of mid-1 check.
            //so to prevent from this error we will check if mid > start or not.
            else if(mid> start && arr[mid-1] > arr[mid]){
                return mid - 1;
            }
           //check if elements at middle, start ,and end are equal or not.

            if (arr[mid] == arr[start] && arr[mid] == arr[end]){

                //then we will skip start and end both.
                //but before skipping we will check if both are pivot element or not.

                //checking if start is pivot or not.
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if (arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side is sorted, so the pivot must be in right.
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }
            else
                end = mid - 1;

        }
        return -1;
    }
}
