package com.company.Searching.BinarySearch.InterviewQuestions;
//Leetcode problem link -->
//https://leetcode.com/problems/find-smallest-letter-greater-than-target

//solution-
public class Smallest_Letter_in_an_Array {
    public static void main(String[] args) {
        char[] letters = {'c', 'd', 'f', 'j'};
        char target = 't';
        //target = 'c';
        //target = 'e';
        char ans = smallestLetter(letters, target);
        System.out.println(ans);
    }
    static char smallestLetter(char[]letters,char target){
        int start = 0;
        int end = letters.length - 1;
        if (letters.length == 0){
            System.out.println("Oops! The given array is empty");
        }


        while (start <= end) {
            // int mid = (start + end)/2;
            //this is not ideal way to initialize mid
            //because adding very large start and end value can give a number which exceeds int value;

            //so here's an optimized way to do it.
            //s + (e-s)/2 --> if we solve it then we will get ( 2s + e-s)/2 -->
            // s will cancel out and we will get (s+e)/2

            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            }
            else  {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];

    }

}
