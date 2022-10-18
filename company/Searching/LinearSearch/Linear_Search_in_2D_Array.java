package com.company.Searching.LinearSearch;
import java.util.Arrays;

public class Linear_Search_in_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {{45, 23, 44, 20}
                        ,{2, 5, 6, 3}
                        ,{48, 30,85, 21}
                        ,{54, 34, 74, 25}
        };
        int target = 85;
        int[] ans = search(arr, target); //it is the format of return type of search method.
        System.out.println(Arrays.toString(ans));

        //printing maximum value
        int ans2 = max(arr);
        System.out.println(ans2);

    }
    static int[] search(int[][] arr, int target){
        if (arr.length == 0){
            return new int[]{-1,-1};
        }
        for (int row = 0; row<arr.length; row++){
            for (int col = 0; col<arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int []{row, col};
                }
            }
        }

        return new int []{-1,-1};
    }
    //returning max value from 2D Array using searching.
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;


        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }

        return max;
    }
}
