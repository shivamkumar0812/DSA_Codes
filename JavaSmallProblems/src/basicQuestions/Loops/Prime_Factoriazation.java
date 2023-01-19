package basicQuestions.Loops;

public class Prime_Factoriazation {
    public static void main(String[] args) {
        int n = 46;
        for (int divisor = 2; divisor * divisor <= n; divisor++){
            while (n % divisor == 0){
                n = n/ divisor;
                System.out.print(divisor + " ");
            }
        }
        if (n!= 0){
            System.out.print(n);
        }
    }
}
