package ArraysQuestions;
//problem link - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Even_Digits {
    public static void main(String[] args) {
        int[] num = new int[]{12, 4, 5, 4842, 204};
        System.out.println(findNumbers(num));
        System.out.println(countDigits2(-1093));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        int[] var2 = nums;
        int var3 = nums.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            if (even(num)) {
                ++count;
            }
        }

        return count;
    }

    static boolean even(int num) {
        int noOfDigits = countDigits(num);
        return noOfDigits % 2 == 0;
    }

    static int countDigits2(int n) {
        if (n < 0) {
            n *= -1;
        }

        return (int)Math.log10((double)n) + 1;
    }

    static int countDigits(int n) {
        int count = 0;
        if (n < 0) {
            n *= -1;
        } else if (n == 0) {
            return 1;
        }

        while(n > 0) {
            ++count;
            n /= 10;
        }

        return count;
    }
}
