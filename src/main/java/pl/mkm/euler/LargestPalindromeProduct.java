package pl.mkm.euler;

public class LargestPalindromeProduct {

    public static void main(String[] args) {

        int p;
        int max = 0;

        for (int i = 100; i <= 999; i++) {
            for (int k = 100; k <= 999; k++) {
                p = i * k;
                if (isPalindrome(p) && max < p) max = p;
            }
        }
        System.out.println("max palindrome of 6 digits: " + max);
    }

    private static Boolean isPalindrome(int p) {
        String s = Integer.toString(p);
        String s2 = new StringBuffer(s).reverse().toString();
        return s.equals(s2);
    }
}
