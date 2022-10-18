package com.company.Searching.LinearSearch;

public class EvenDigits {
    //problem link - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] num = {12, 4 ,5 ,4842, 204};
        System.out.println(findNumbers(num));
        System.out.println(countDigits2(-1093));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            //if number is even then increase the count.
            //we are calling even function in below statement which returns boolean value
            if(even(num)){
               count++;
            }
        }
        //returning count to the main function.
        return count;
    }

    static boolean even(int num){
        //calling countDigits function which is returning the no.of.Digits
        int noOfDigits = countDigits(num);

        //it will return true if statement satisfies the conditions else returns false.
        return noOfDigits % 2 == 0;
    }
    static int countDigits2(int n){

        //converting the negative number into positive by multiplying with -1.
        if (n < 0){
            n = n* -1;
        }
        //it is optimized statement to find the no. of Digits.
        return (int) (Math.log10(n)) + 1;
    }

    static int countDigits(int n){

        int count = 0;
        //converting -number to +number.
        if (n < 0){
            n = n* -1;
        }
        //if number is 0 then return 1 no of Digit.
        else if(n == 0){
            return 1;
        }
        while (n > 0){
            count++;
            n = n/10;
        }
        return count;
    }
}
