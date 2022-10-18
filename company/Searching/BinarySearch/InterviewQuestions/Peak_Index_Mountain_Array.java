package com.company.Searching.BinarySearch.InterviewQuestions;
//Question Link -
//https://leetcode.com/peak-index-in-mountain-array
//Also it will have the same answer for another leetcode  question -
//https://leetcode.com/find-peak-element

//note - a mountain array does not have any duplicate value simultaneously.

public class Peak_Index_Mountain_Array {

    public static void main(String[] args) {
        int[] mountain = {0, 1, 2, 3,4, 2, 1, 0};
        int ans = searchRange(mountain);
        System.out.println(ans);

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
            else
                //We are in ascending part of the array
                // because we know that all the right elements will be greater than mid element.
                start = mid + 1;
        }
        //In the end, start == end and it will point to the largest number because of the 2 checks above.
        //start and end will always try to find the largest number because of the 2 checks.
        //hence, when they are pointing to just one element then it will be the largest number.
        //more elaboration: -->  at every point of time, start and end will  be pointing to a possible answer,
        //and when there will be only 1 item remaining, it will be the best possible answer.

        return start; // we can also return end as both are equal.
    }
}
