package basicQuestions.Scanner;

import java.util.Scanner;

public class Square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int answer = sqrt(number);
        System.out.println(answer);
    }
    static int sqrt(int x){
        int start = 0;
        int end = x;
        int result = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (mid*mid == x){
                return (int) mid;
            }
            else if(mid*mid > x){
                end = mid - 1;
            }
            else {
               result = mid;
               start = mid + 1;
            }
        }
        return (int) result;
    }


}
