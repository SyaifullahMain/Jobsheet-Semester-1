package semseter1.Pertemuan5;

import java.util.Scanner;

public class PemilihanPercobaan1_16 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = input16.nextInt();
        String hasil = (angka % 2 == 0) ? "Angka " + angka + " bilangan genap" : "Angka " + angka + " bilangan ganjil"; 
        System.out.println(hasil);
    }
    
}