import java.util.Scanner;
public class Ucapan_16 {
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you");
    }
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang akan diberi ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
}
