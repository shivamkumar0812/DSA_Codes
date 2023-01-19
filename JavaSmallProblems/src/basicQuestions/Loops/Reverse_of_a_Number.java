package basicQuestions.Loops;

public class Reverse_of_a_Number {
    public static void main(String[] args) {
        int n = 9837975;
        while(n>0) {
            int remainder = n % 10;
            System.out.println(remainder);
            n = n / 10;
        }
    }
}
