package famousQuestions;

import java.util.Random;
import java.util.Scanner;

class Game{
    //Variables
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    //Constructor
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    //Getters and setters
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    //Methods -
    void takeUserInput() {
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isInputCorrect(){
        noOfGuesses++;
        if (inputNumber == number){
            System.out.printf("Your guess is right, the number was %d\n You guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if (inputNumber < number){
            System.out.println("Guess is too low");
        }
        else if (inputNumber > number){
            System.out.println("Guess is too high");
        }
        return false;

    }
}
public class Guessing_a_Number_Game {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isInputCorrect();
        }

    }
}
