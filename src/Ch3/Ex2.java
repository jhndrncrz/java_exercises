package Ch3;
public class Ex2 {
    public static void main(String[] args) {
        int numberWithMaxDivisors;
        int maxNumberOfDivisors;

        numberWithMaxDivisors = 1;
        maxNumberOfDivisors = 1;

        for (int thisNumber = 1; thisNumber < 10000; thisNumber++) {
            int thisNumberDivisors = 0;
            for (int divisor = 1; divisor <= thisNumber; divisor++) {
                if (thisNumber % divisor == 0) {
                    thisNumberDivisors++;
                }
            }
            if (thisNumberDivisors > maxNumberOfDivisors) {
                numberWithMaxDivisors = thisNumber;
                maxNumberOfDivisors = thisNumberDivisors;
            }
        }

        System.out.printf("The number with the most divisors is %d, with %d divisors.", numberWithMaxDivisors, maxNumberOfDivisors);

    }
}
