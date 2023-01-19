package famousQuestions;

public class Prime_Number_From_1_to_100 {
    public static void main(String[] args) {
        //Printing all the prime numbers from 1 to 100
        for (int i = 0; i <= 100; i++) {
            if (isPrime(i)) {
                //System.out.println(i + " is a prime number");
            }
        }

        //Printing all the prime numbers between given range
        int start = 8;
        int end = 70;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
            }
        }
    }
//recursive function to check prime number
        static boolean isPrime(int n){

            //if number is less than 2 than obviously it is not a prime number
            if (n < 2){
                return  false;
            }

            for (int i = 2; i <= n/2; i++){
                if ((n % i) == 0){
                    return false;
                }
            }
            return true;
    }
}
