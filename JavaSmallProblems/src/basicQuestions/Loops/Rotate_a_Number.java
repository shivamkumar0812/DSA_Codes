package basicQuestions.Loops;

public class Rotate_a_Number {
    public static void main(String[] args) {
        int n = 23457;
        int noOfRotation = 2;
        int solutionHasToBe = 57234;

        //Creating divisor and multiplier to get the desired result.
        int divisor = 1;
        int multiplier = 1;


        //Finding number of digits to get divisor and multiplier.
        int temp = n;
        int noOfDigits = 0;

        while(temp>0){
            temp = temp / 10;
            noOfDigits++;
        }

        //To handle big number of rotation.
        noOfRotation = noOfRotation % noOfDigits;

        //To handle negative number of rotation.
        if (noOfRotation < 0){
            noOfRotation += noOfDigits;
        }
        //Running loop to get the correct divisor and multiplier
        for (int i = 1; i<= noOfDigits; i++){
            if (i <= noOfRotation){
                divisor = divisor * 10;
            }
            else{
                multiplier = multiplier * 10;
            }
        }

        int quotient = n / divisor;
        int remainder = n % divisor;

        int rotatedNumber = remainder * multiplier + quotient;
        System.out.println(rotatedNumber);

    }
}
