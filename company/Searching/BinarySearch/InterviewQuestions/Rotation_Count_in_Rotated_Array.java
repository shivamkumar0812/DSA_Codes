package com.company.Searching.BinarySearch.InterviewQuestions;

public class Rotation_Count_in_Rotated_Array {
    public static void main(String[] args) {
        int[] rotated = {5, 6, 7, 8, 0, 1, 2};
        int ans = findPivot(rotated) + 1;
        System.out.println(ans);
    }
    //It will work for non-duplicate values.
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
}
