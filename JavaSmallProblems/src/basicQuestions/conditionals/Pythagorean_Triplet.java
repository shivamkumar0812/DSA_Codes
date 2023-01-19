package basicQuestions.conditionals;

public class Pythagorean_Triplet {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 13;
        //Finding maximum from a, b, and c.
        int maximum = max(a,b,c);

        //if a is maximum and a2 = b2 + c2 then a,b,c are pythagorean triplets.
        //Similarly other 2 else if statement will check for pythagorean triplets.
        if (maximum == a && a*a == b*b + c*c){
            System.out.println("Yes, it is a pythagorean triplet");
        } else if (maximum == b && b*b == a*a + c*c){
            System.out.println("Yes, it is a pythagorean triplet");
        } else if (maximum == c && c*c == a*a + b*b){
            System.out.println("Yes, it is a pythagorean triplet");
        } else {
            System.out.println("No, it is not a pythagorean triplet");
        }

    }

    //Max Function to find maximum number from three digits.
    static int max(int a, int b, int c){
        int max = 0;
        if (a>b && b>c){
            max = a;
        } else if (b>a && a>c) {
            max = b;
        }
        else
            max = c;
        return max;
    }
}
