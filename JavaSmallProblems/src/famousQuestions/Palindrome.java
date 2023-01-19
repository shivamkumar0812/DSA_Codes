package famousQuestions;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int temp, reverse;
        int sum = 0;

        System.out.println("Enter a number you want to check palindrome or not: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        temp = n;
        while (n>0){
            reverse = n%10;
            sum = sum * 10 + reverse;
            n = n/10;
        }
        if (temp == sum){
            System.out.println("Yes it is a palindrome");
        }
        else {
            System.out.println("No, it is not a palindrome");
        }
    }
    }

