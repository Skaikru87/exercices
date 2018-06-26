package pl.mkm.euler;

public class SumSquareDifference {

    public static void main(String[] args) {

        int squareOfSum = 0;
        int sumOfSquares = 0;
        int difference;

        for (int i = 1; i <= 100; i++) {
            squareOfSum = squareOfSum + i;
            sumOfSquares = sumOfSquares + i * i;
        }
        squareOfSum = squareOfSum * squareOfSum;
        difference = squareOfSum - sumOfSquares;

        System.out.println("difference = " + difference);
    }
}
