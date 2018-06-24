package pl.mkm.euler;

public class EvenFibonacciNumbers {

    private static long fibonacci(long a) {
        if (a <= 2) {
            return a;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }

    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; fibonacci(i) < 4000000; i++) {
            long fib = fibonacci(i);
            if (fib % 2 == 0) sum += fib;
        }
        System.out.println("answer: " + sum);
    }
}
