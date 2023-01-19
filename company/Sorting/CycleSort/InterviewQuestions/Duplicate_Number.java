package com.company.Sorting.CycleSort.InterviewQuestions;


public class Duplicate_Number  {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3};
        int answer = findDuplicate(arr);
        System.out.println("Duplicate Number is "+ answer);
    }
    static int findDuplicate(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
        for (int index = 0; index<arr.length; index++){
            if (arr[index] != index + 1){
                return arr[index];
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
