import java.util.Scanner;

public class UcapanTerimkasih_16 {
    public static void main(String[] args) {
        UcapanTerimaKasih();
        String ucapan = "Terima kasih Pak.. Bu.. Semoga Sehat Selalu";
        UcapanTambahan(ucapan);
    }
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang akan diberi ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world." + "You inspired in me a love for learning and made me feel like I could do ask you anything.");
    }
    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
}

