package pl.mkm.euler;

public class LargestPrimeFactor {

    public static void main(String[] args) {

        long number = 600851475143L;
        long maxPrimeFactor = 0;

        for (long i = 2; i <= number; i++) {
            while (number % i == 0) {
                number = number / i;
                if (i > maxPrimeFactor) maxPrimeFactor = i;
                System.out.println(i);
            }
        }
        System.out.println("Max prime factor: " + maxPrimeFactor);
    }
}
