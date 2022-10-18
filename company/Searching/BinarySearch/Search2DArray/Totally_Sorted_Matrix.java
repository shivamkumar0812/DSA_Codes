package com.company.Searching.BinarySearch.Search2DArray;

import java.util.Arrays;

public class Totally_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target = 10;
        int[] ans = search2D(matrix, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        //this will run when 2 rows will be remaining

        while (cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            else if (target > matrix[row][mid]){
                cStart = mid + 1;
            }
            else
                cEnd = mid - 1;
        }
        return new int[]{-1,-1};
    }

    static int[] search2D(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 1){
            return binarySearch(matrix, 0, 0, col-1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col / 2;

        //this loop will reduce the matrix into row of size 2.
        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            else if (matrix[mid][cMid] < target){
                rStart = mid;
            }
            else
                rEnd = mid;
        }

        //now the matrix is reduced into half row size.

        //now we will check if the target is present int the middle col of both the rows or not.
        if (matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }
        //After that we will search into 4 parts.
        if (target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0,cMid-1, target);
        }
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col-1]){
            return binarySearch(matrix, rStart, cMid + 1,col - 1, target);
        }
        if (target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0,cMid-1, target);
        }
        else{
            return binarySearch(matrix, rStart + 1, cMid + 1, col - 1, target);
        }


    }
}
