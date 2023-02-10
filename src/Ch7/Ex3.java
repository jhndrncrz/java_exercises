package Ch7;

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        double[] testDefault = new double[10000];
        for (int i = 0; i < 10000; i++) {
            testDefault[i] = Math.random() * 1000;
        }
        double[] testSelection = testDefault.clone();

        long startDefault = System.nanoTime();
        Arrays.sort(testDefault);
        long endDefault = System.nanoTime();

        // System.out.println(Arrays.toString(testDefault));
        System.out.printf("Arrays.sort() took %d nanoseconds.\n", endDefault - startDefault);

        long startSelection = System.nanoTime();
        selectionSort(testSelection);
        long endSelection = System.nanoTime();

        // System.out.println(Arrays.toString(testSelection));
        System.out.printf("selectionSort() took %d nanoseconds.\n", endSelection - startSelection);
    }

    static void selectionSort(double[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int iMax = 0;

            for (int j = 0; j < i; j++) {
                if (array[j] > array[iMax]) {
                    iMax = j;
                }
            }

            double temp = array[i];
            array[i] = array[iMax];
            array[iMax] = temp;
        }
    }

    static void selectionSort(String[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int iMax = 0;

            for (int j = 0; j < i; j++) {
                if (array[j].compareTo(array[iMax]) > 0) {
                    iMax = j;
                }
            }

            String temp = array[i];
            array[i] = array[iMax];
            array[iMax] = temp;
        }
    }
}
