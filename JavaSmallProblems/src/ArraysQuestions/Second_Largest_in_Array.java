package ArraysQuestions;

public class Second_Largest_in_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 36 ,34 ,79,67,79};
        int ans = print2ndLargest(arr);
        System.out.println(ans);
    }
    static int print2ndLargest(int[] arr){
        int size = arr.length;

        if (size < 2){
            System.out.println("Invalid Input");
        }

        //this 2 statements can only be used if array doesn't have any duplicate values.
        //Sorting the array
        //Arrays.sort(arr);

        //if we want to find nth largest number then simply put n instead of 2.
        //return arr[size - 2];

        //if we want to find the nth smallest number then we can simply put n instead of 2.

        //finding 2nd smallest number in the array.
        //return arr[2 - 1]; //formula for 2nd smallest - arr[n-1];

        //this loop can only be used if array have any duplicate values

        for (int i = size - 2; i >= 0; i--){
            if (arr[i] != arr[size-1])
                return arr[i];
        }
        return Integer.MIN_VALUE;
    }
}
