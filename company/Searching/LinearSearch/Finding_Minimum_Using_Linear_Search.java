package com.company.Searching.LinearSearch;
public class Finding_Minimum_Using_Linear_Search {
    public static void main(String[] args) { ;
        int[] arr = {34, 20, 10, 38, 85, 45, 59, 90};
        System.out.println(min(arr));
    }
    //Suppose arr.length != 0
    static int min(int[] arr){
        int ans = arr[0];

        for (int index = 0; index< arr.length; index++){
            if (arr[index] < ans){
                ans = arr[index];
            }
        }

        return ans;
    }
}
