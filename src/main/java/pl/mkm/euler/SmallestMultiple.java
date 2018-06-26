package pl.mkm.euler;

public class SmallestMultiple {

    public static void main(String[] args) {

        int number = 0;
        while (true) {
            number++;
            if (isDivisibleByAll(number)) {
                System.out.println("answer: " + number);
                return;
            }
        }
    }

    private static boolean isDivisibleByAll(int number) {
        boolean check = false;
        for (int i = 1; i <= 20; i++) {
            if (number % i != 0) {
                check = false;
                break;
            } else {
                check = true;
            }
        }
        return check;
    }
}
