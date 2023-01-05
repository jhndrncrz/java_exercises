package Ch2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Ex7 {
    public static void solution() {
        String fullName;
        int grade1, grade2, grade3;
        double average;
        File file = new File("src\\testdata.txt");
        try {
            Scanner fileReader = new Scanner(file);
            fullName = fileReader.nextLine();
            grade1 = fileReader.nextInt();
            grade2 = fileReader.nextInt();
            grade3 = fileReader.nextInt();
            average = (grade1+grade2+grade3)/3.0;
            System.out.printf("Student: %s, Average: %1.2f", fullName, average);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
