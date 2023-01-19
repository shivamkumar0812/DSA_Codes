package basicQuestions.Scanner;

import java.util.Random;
import java.util.Scanner;

public class KMStoMiles
{
    public static void main(String[] args) {
        //Java Program to convert kilometers to mile.
        System.out.println("This program will convert kms to miles.");
        System.out.println("Enter number of kilometers: ");
        Scanner sc = new Scanner(System.in);
        float kilometer = sc.nextFloat();
        System.out.println("Number of miles is: ");
        float miles = kilometer * 0.621f;
        System.out.println(miles);
    }
}
