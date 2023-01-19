package basicQuestions.Loops;

public class Print_digits_of_a_number {
    public static void main(String[] args) {
        int n = 8979429;
        int temp;
        int noOfDigits = 0;
        temp = n;
        while (temp > 0){
            temp = temp / 10;
            noOfDigits++;
        }
        int divisor = (int)Math.pow(10, noOfDigits - 1);
        while (divisor > 0){
            int quotient = n / divisor;
            System.out.println(quotient);
            n = n % divisor;
            divisor = divisor/ 10;
        }
    }
}
