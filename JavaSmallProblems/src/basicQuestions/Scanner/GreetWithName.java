package basicQuestions.Scanner;

import java.util.Scanner;

public class GreetWithName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will greet anyone with his/her name");
        System.out.println("Please Enter your name");
        String greetName = sc.nextLine();
        System.out.println("Have a great day" + greetName);
    }
}
