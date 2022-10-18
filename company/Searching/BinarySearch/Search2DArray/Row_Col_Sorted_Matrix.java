package com.company.Searching.BinarySearch.Search2DArray;

import java.util.Arrays;

public class Row_Col_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                          {10,20,30,40},
                          {15,25,35,45},
                          {28,29,37,49},
                          {34,35,38,51}
        };
        int target = 37;
        int[] ans = binarySearch2D(matrix, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] binarySearch2D(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while(row <= matrix.length && col >= 0){

            if (matrix[col][row] == target){
                return new int[]{row, col};
            }
            else if (matrix[col][row] < target){
                row++;
            }
            else
                col--;
        }


        return new int[]{-1,-1};
    }
}
