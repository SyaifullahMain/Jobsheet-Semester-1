
/**
 * NestedLoop_2341720013
 */
import java.util.Scanner;

public class NestedLoop_2341720013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temp = new double[5][7];
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                temp[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
        for (double[] ds : temp) {
            
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temp[0].length; j++) {
                System.out.println(temp[i][j]);
            }
            System.out.println();
        }

        int city = 1;
        for (double[] row : temp) {
            System.out.println("Kota ke-" + city++);
            for (double column : row) {
                System.out.println(column);
            }
        }

        double[] avTemp = new double[temp.length];
        for (int i = 0; i < temp.length; i++) {
            double average = 0;
            for (int j = 0; j < temp[i].length; j++) {
                average += temp[i][j];
            }
            average /= temp[i].length;
            avTemp[i] = average;
        }

        city = 1;
        System.out.println("Rata-rata suhu masing-masing kota:");
        for (double value : avTemp) {
            System.out.printf("Kota ke-%d : %.2f%n", city++, value);
        }
    }
}