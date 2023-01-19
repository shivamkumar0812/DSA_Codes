package famousQuestions;

import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        //0 for Rock
        //1 for paper
        //2 for scissor
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor: ");
        int userInput = sc.nextInt(3);

        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Match Drawn");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 ||
                userInput == 2 && computerInput == 1){
            System.out.println("You win");
        }
        else
            System.out.println("Computer win");

        //System.out.println("Computer Choice: " + computerInput);
        if (computerInput ==0) {
            System.out.println("Computer choose: Rock");
        }
        else if (computerInput ==1) {
            System.out.println("Computer choose: Paper");
        }
        else {
            System.out.println("Computer choose: Scissor");
        }
    }
}
