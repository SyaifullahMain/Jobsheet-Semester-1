
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
        
        int i = 1;
        for (double[] row : temp) {
            System.out.println("Kota ke-" + i++);
            for (double column : row) {
                System.out.println(column);
            }
        }
    }
}