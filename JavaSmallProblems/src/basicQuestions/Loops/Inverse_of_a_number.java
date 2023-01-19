package basicQuestions.Loops;

public class Inverse_of_a_number {
    public static void main(String[] args) {
    int n = 2314;

    int index = 0;
    int inverse = 0;
    while(n>0){
        int remainder = n % 10;
        n = n/10;
        index++;
        inverse += index * Math.pow(10,remainder - 1);
    }
        System.out.println(inverse);

    }

    public static class Reverse_of_a_Number {
        public static void main(String[] args) {
            int number = -53890;
            int answer = reverse(number);
            System.out.println(answer);
        }
        static int reverse(int x){
            int reverse = 0;
            boolean isNegative = x<0;
            int counter = 0;
            if(isNegative){
                x = x*-1;
                counter++;
            }
            while(x>0){
                int remainder = x  % 10;
                if (x > Integer.MAX_VALUE / 10 || x< Integer.MIN_VALUE/10){
                    return 0;
                }
                reverse = reverse * 10 + remainder;
                x = x / 10;
            }
            if(counter > 0){
                reverse = reverse * -1;
            }
            return reverse;
        }
    }
}
