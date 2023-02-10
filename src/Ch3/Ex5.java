package Ch3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex5 {
    public static void main(String[] args) {
        double totalSales;
        int noData;

        try {
            File file = new File("src/Ch3/sales.dat");
            Scanner fileRead = new Scanner(file);

            totalSales = 0;
            noData = 0;

            while (fileRead.hasNextLine()) {
                String line = fileRead.nextLine();
                String data = line.substring(line.indexOf(":") + 1);

                try {
                    totalSales += Double.parseDouble(data);
                }
                catch (NumberFormatException e) {
                    noData++;
                }
            }
            System.out.printf("Total Sales: %1.2f\nNo Data: %d city/s", totalSales, noData);
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: file not found!");
        }

    }
}
