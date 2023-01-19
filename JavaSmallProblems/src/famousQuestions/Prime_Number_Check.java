package famousQuestions;

public class Prime_Number_Check {
    public static void main(String[] args) {
        //the following do not use flag to check a prime number
        int number = 15;

        if (isPrime(number)){
            System.out.println("Yes, It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
        //The following function uses a flag to check prime number
        isPrime2(number);
    }
    //function using a flag to check prime number
    static void isPrime2(int n){
        int m, flag = 0;
        m =n/2;
        if (n == 0 || n == 1){
            System.out.println(n+ " is not a prime number");
        }
        else{
            for (int i =2; i<m; i++){
                if (n % i == 0){
                    System.out.println(n + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println(n + " is a prime number");
            }
        }
    }

    static boolean isPrime(int n){

        //if number is less than 2 than obviously it is not a prime number
        if (n < 2){
            return  false;
        }
        //running the loop from 2 to n/2 and checking if n is divided by 2 to n/2 or not.
        for (int i = 2; i <= n/2; i++){
            if ((n % i) == 0){
                return false;
            }
        }
        return true;
    }
}
