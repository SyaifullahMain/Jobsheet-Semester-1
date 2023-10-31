/**
 * ContohVariabelNoAbsen
 */
public class ContohVariabel16 {

    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte _umurSayaSekarang = 18;
        double $ipk = 3.70, tinggi = 1.68;
        System.out.println(salahSatuHobiSayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " +_umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s",$ipk, tinggi));
    }
}