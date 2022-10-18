package com.company.Searching.LinearSearch;
public class Max_Wealth {
    //Problem Link -
    //https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
        int [][] accounts= {{4,1,9},{3,3,7},{3,5,2}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        //person = row
        //accounts = col
        for (int[] ints : accounts) {
            //take sum of every row and then after completing the row again initialize it with 0.
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > max) {
                max = sum;
            }

        }
        return max;
    }
}
