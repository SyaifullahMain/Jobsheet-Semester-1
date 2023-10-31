import java.util.Scanner;
public class WhileKelipatan16 {
    public static void main(String[] args) {
        Scanner scan16 =  new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0;

        System.out.print("Masukkan Bilangan kelipatan (1-9) : ");
        kelipatan = scan16.nextInt();
        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
            }
            i++;
        }
        float rataRata = jumlah / counter;
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %f\n", kelipatan, rataRata);
    }
}
