package famousQuestions;

public class Star_Pattern_1 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i<=n; i++){
            for (int j = 0; j<=i; j++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
