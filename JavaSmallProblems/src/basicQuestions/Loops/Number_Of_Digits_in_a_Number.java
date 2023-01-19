package basicQuestions.Loops;

public class Number_Of_Digits_in_a_Number {
    public static void main(String[] args) {
        int n = 345089700;
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
