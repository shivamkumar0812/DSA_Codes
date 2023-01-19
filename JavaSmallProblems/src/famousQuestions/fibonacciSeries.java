package famousQuestions;

public class fibonacciSeries {
    public static void main(String[] args) {
        //fibonacci series - 0,1,1,2,3,5,8,13,21,34;

        //Printing the element at index no specified.
        int index = 6;
        int ans = fibonacciSeries(index);
        System.out.println(ans);

        //Printing all the elements of a fibonacci series upto n.

        int n = 10;
        for (int i = 0; i <= n; i++) {
            //System.out.print(fibonacciSeries(i) + ", ");
        }
    }
        static int fibonacciSeries(int num){
            int sum = 0;
            if (num == 0){
                return 0;
            }
            else if(num == 1){
                return  1;
            }
            else {
                sum += fibonacciSeries(num - 1) + fibonacciSeries(num - 2);
                return sum;
            }


    }
}
