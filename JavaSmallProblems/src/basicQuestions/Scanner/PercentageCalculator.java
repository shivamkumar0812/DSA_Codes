package basicQuestions.Scanner;

import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {

       System.out.println("This program will calculate percentage of students.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks of Subject 1");
            byte sub1 = sc.nextByte();
            System.out.println("Enter marks of Subject 2");
            byte sub2 = sc.nextByte();
            System.out.println("Enter marks of Subject 3");
            byte sub3 = sc.nextByte();
            System.out.println("Enter marks of Subject 4");
            byte sub4 = sc.nextByte();
            System.out.println("Enter marks of Subject 5");
            byte sub5 = sc.nextByte();
            System.out.println("Enter total marks of 1 subject: ");
            byte totalMarks = sc.nextByte();

            short grandTotal = (short) (sub1 + sub2+ sub3 + sub4 + sub5);
            float percentage = (float) ((grandTotal * 100)/totalMarks/ 5 );
            System.out.println("Your total percentage is: ");
            System.out.println(percentage);
            //totalMarks = 90*5 * 100/ 5 * grandTotal;

    }
}
