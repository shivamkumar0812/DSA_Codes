package basicQuestions.Loops;

public class GCD_and_LCM {
    public static void main(String[] args) {
        int number1 = 30;
        int number2 = 45;

        //preserving value of number1 and number2
        int originalNumber1 = number1;
        int originalNumber2 = number2;

        while(number1%number2!=0){
            int remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }
        int gcd = number2;
        int lcm = (originalNumber1 * originalNumber2)/gcd;
        System.out.println("GCD of " + originalNumber1 +" and "+ originalNumber2 +" is " + gcd);
        System.out.println("LCM of " + originalNumber1 +" and "+ originalNumber2 +" is " + lcm);
    }

}
