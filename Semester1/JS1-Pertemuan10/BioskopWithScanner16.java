import java.util.Scanner;
public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama, pilih;
        int baris, kolom;
        while (true) {
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextLine();
            if (pilih.equals("1")) {
                while (true) {
                    System.out.print("Masukan nama: ");
                    nama = input.nextLine();
                    System.out.print("Masukan baris: ");
                    baris = input.nextInt();
                    System.out.print("Masukan kolom: ");
                    kolom = input.nextInt();
                    input.nextLine();
                    penonton[baris-1][kolom-1] = nama;
                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilih = input.nextLine();
                    if (pilih.equalsIgnoreCase("n")) break;
                }
            } else if (pilih.equals("2")) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton pada baris ke-"+(i+1)+ " : " + String.join(", ", penonton[i]));
                }
            } 
            else if (pilih.equals("3")) break;
            else System.out.println("Input tidak dimengerti");
        }
    }
}
