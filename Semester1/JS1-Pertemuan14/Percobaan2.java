import java.util.Scanner;
public class Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();
        System.out.print(hitungPangkat(bilangan, pangkat));
    }
    static int hitungPangkat(int x, int y) {
        // return (y == 0) ? 1 : x * hitungPangkat(x, y - 1);
        if (y == 0) {
            System.out.print("1=");
            return 1;
        } else {
            System.out.print(x + "x");
            return x * hitungPangkat(x, y - 1);
        }
    }
}
