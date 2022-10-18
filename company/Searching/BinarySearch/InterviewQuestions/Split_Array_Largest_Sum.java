package com.company.Searching.BinarySearch.InterviewQuestions;
//Question Link -
//https://leetcode.com/split-array-largest-sum


public class Split_Array_Largest_Sum {
    public static void main(String[] args) {
        int[] splited = {7, 2, 5, 8, 10};
        int m = 2;
        int ans = splittedArray(splited, m);
        System.out.println(ans);

    }
    static int splittedArray(int[] arr, int m){
        int start = 0;
        int end = 0;

        for (int i=0; i<arr.length; i++){
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        //we will do binary search here...
        while (start < end){
            //try for middle as potential answer
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide this in with this max sum.
            int sum = 0;
            int pieces = 1; //this represents partition

            for (int num: arr) {
                if (sum + num > mid){
                    //you cannot add it in the subarray, make a new one.
                    //say you add this num in new subarray, then sum = num.
                    //if the sum of all the elements exceeds mid then we will make a new partition.
                    //and we will initialize the sum with the number.
                    sum = num;
                    pieces++;
                }
                else
                    sum += num;
            }
            if (pieces > m){
                start = mid+1;

            }
            else
                end = mid;
        }
        return start; // we can also return end because start = end;
    }
}
