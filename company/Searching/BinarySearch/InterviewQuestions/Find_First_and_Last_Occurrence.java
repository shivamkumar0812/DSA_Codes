package com.company.Searching.BinarySearch.InterviewQuestions;
//Leetcode problem link -
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array


import java.util.Arrays;

public class Find_First_and_Last_Occurrence {

    //In this question we are going to do 2 BinarySearch
    //first for first occurrence,
    //and the second one for last occurrence.

    public static void main(String[] args) {
        int[] marks = {1, 2, 5, 7, 7, 7, 7, 8, 8};
        int target = 7;
        int[] ans = searchRange(marks, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] marks, int target){
        int[] ans = {-1, -1};

        //checks for first occurrence if first index
        ans[0] = search(marks, target, true);
        if (ans[0] != target){
            ans[1] = search(marks, target, false);
        }
        return ans;
    }

    static int search(int[] marks, int target, boolean findFirstIndex){
        int ans = -1;
        int start = 0;
        int end = marks.length - 1;

        if (marks.length == 0){
            return ans;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < marks[mid]) {
                end = mid - 1;
            } else if (target > marks[mid]) {
                start = mid + 1;
            }
            else {
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }

        return ans;
    }
}
