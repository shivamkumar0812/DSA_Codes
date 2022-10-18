package com.company.Searching.LinearSearch;

import java.util.Arrays;
public class Linear_Search_in_String {
    public static void main(String[] args) {
        String name="Shivam";
        char target = 'i';
        int ans = linearSearch(name, target);
        //System.out.println(ans);

        //to print character array -->
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static int linearSearch(String s, char target){
        if (s.length() == 0){
            //Here length method have () because it is function in String class.
            // So () is calling the length function
            return -1;
        }
        //Checking whether the element is present at index i or not.
        for (int index = 0; index<=s.length(); index++){
            if (s.charAt(index) == target){
                return index;
            }
        }

        return -1;
    }

    //To create a char array from the given String.
    static boolean linearSearch2(String s, char target){
        if (s.length() == 0){
            //Here length method have () because it is function in String class.
            // So () is calling the length function
            return false;
        }
        //Checking whether the element is present at index i or not.
        for (char ch : s.toCharArray()){
            if (ch == target){
                return true;
            }
        }

        return false;
    }
}
