package com.company.Searching.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] marks = {99, 80, 23, 22, 21 ,20, 10, 2, 1, 0, -4,-6};
        int target = 0;
        int ans = orderAgnosticSearch(marks, target);
        System.out.println(ans);
    }
    //making a static function
    //it will return index if target is found.
    //else it will return -1 if the target does not exist in the array.

    static int orderAgnosticSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr.length == 0) {
            return -1;
        }
        boolean isAsc = arr[start] < arr[end];


            while (start <= end) {
                // int mid = (start + end)/2;
                //this is not ideal way to initialize mid
                //because adding very large start and end value can give a number which exceeds int value;

                //so here's an optimized way to do it.
                //s + (e-s)/2 --> if we solve it then we will get ( 2s + e-s)/2 -->
                // s will cancel out and we will get (s+e)/2
                int mid = start + (end - start) / 2;

                if (target == arr[mid]){
                    return mid;
                }
                else if (isAsc){
                    if (target < arr[mid]) {
                        end = mid - 1;
                    } else  {
                        start = mid + 1;
                    }
                }
                else{
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else  {
                        start = mid + 1;
                    }
                }

            }


        return -1;
    }
}
