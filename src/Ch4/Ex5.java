package Ch4;

import java.util.Arrays;

public class Ex5 {

    public static final ArrayProcessor arrayMaximum = array -> {
        double max = array[0];
        for (double i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    };
    public static final ArrayProcessor arrayMinimum = array -> {
        double min = array[0];
        for (double i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    };
    public static final ArrayProcessor arraySum = array -> {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        return sum;
    };
    public static final ArrayProcessor arrayAverage = array -> {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        return sum / array.length;
    };

    public static ArrayProcessor counter(double value) {
        return array -> {
            int count = 0;
            for (double i : array) {
                if (i == value) {
                    count++;
                }
            }
            return count;
        };
    }

    public static void main(String[] args) {
        double[] sampleArray = {1.1, 3.6, -5.34, 7.29, -9, 11, 13.5, 89.2};

        System.out.printf("Maximum: %f\n", arrayMaximum.apply(sampleArray));
        System.out.printf("Minimum: %f\n", arrayMinimum.apply(sampleArray));
        System.out.printf("Sum: %f\n", arraySum.apply(sampleArray));
        System.out.printf("Average: %f\n", arrayAverage.apply(sampleArray));

    }
}
