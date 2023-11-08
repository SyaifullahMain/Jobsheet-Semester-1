
/**
 * Quiz16
 */
import java.util.Random;
import java.util.Scanner;
public class Quiz16 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu = 'Y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                String clue = (answer>number) ? "Angka anda lebih besar" : "Angka anda lebih kecil";
                System.out.println(clue);
                success = (answer == number);
            } while (!success);
            System.out.println("Tebakan berhasil nilai yang benar = " + number);
            System.out.println("Apakah Anda ingin mengulangi permainan (Y/y)");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}