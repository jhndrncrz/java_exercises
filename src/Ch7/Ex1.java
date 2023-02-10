package Ch7;

import java.util.ArrayList;

public class Ex1 {
    public static ArrayList<Integer> createArrayList(int num, int max) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (arrayList.size() < num) {
            int nextInt = (int) (Math.random() * max);
            if (!arrayList.contains(nextInt)) {
                arrayList.add(nextInt);
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        System.out.println("Creating list with 10 items within the range [0, 100): ");
        System.out.println(createArrayList(10, 100));
        System.out.println("Creating list with 5 items within the range [0, 15): ");
        System.out.println(createArrayList(5, 15));
        System.out.println("Creating list with 10 items within the range [0, 9): ");
        System.out.println(createArrayList(10, 10));
        System.out.println("Creating list with 3 items within the range [0, 1): ");
        System.out.println(createArrayList(3, 10));
    }
}
