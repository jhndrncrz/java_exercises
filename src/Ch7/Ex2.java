package Ch7;

public class Ex2 {
    public static int[][] transpose2DArray(int[][] old2DArray) {
        int r = old2DArray.length;
        int c = old2DArray[0].length;

        int[][] new2DArray = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                new2DArray[j][i] = old2DArray[i][j];
            }
        }

        return new2DArray;
    }

    public static int[][] generate2DArray(int r, int c) {
        int[][] newArray = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newArray[i][j] = (int) (Math.random() * 100);
            }
        }

        return newArray;
    }

    public static void print2DArray(int[][] array) {
        int r = array.length;
        int c = array[0].length;

        System.out.print("    ");
        for (int j = 0; j < c; j++) {
            System.out.printf("%2d ", j);
        }
        System.out.println();

        for (int i = 0; i < r; i++) {
            System.out.printf("%2d  ", i);
            for (int j = 0; j < c; j++) {
                System.out.printf("%2d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void solution() {
        int[][] testArray = generate2DArray(4, 4);

        print2DArray(testArray);
        System.out.println();

        print2DArray(transpose2DArray(testArray));
    }

}
