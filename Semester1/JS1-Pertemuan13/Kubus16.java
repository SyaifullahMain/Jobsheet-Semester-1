import java.util.Scanner;

public class Kubus16 {
    private static Scanner scanner = new Scanner(System.in);
    private static int[][] GNilaiMahasiswa;
    private static int GMinggu;
    private static String[] GNama;
    private static int GJumlahMahasiswa;
    public static void main(String[] args) {
        run();
    }

    static void run () {
        GJumlahMahasiswa = inputInt("Jumlah mahasiswa");
        GMinggu = inputInt("Jumlah minggu");
        inputNamaMahasiswa();
        inputNilaiMahasiswa();
        tampilNilaiMahasiswa();
        nilaiTertinggiMinggu();
        nilaiTertinggi();
        scannerClose();
    }

    static String inputString(String message) {
        System.out.print(message + " : ");
        return scanner.nextLine();
    }

    static int inputInt(String message) {
        System.out.print(message + " : ");
        return scanner.nextInt();
    }

    static void scannerClose() {
        scanner.close();
    }

    static void scannerBug() {
        scanner.nextLine();
    }

    static void inputNamaMahasiswa() {
        GNama = new String[GJumlahMahasiswa];
        scannerBug();
        System.out.println("Max 4 huruf");
        for (int i = 0; i < GJumlahMahasiswa; i++) {
            GNama[i] = inputString("Nama mahasiswa ke-" + (i + 1));
        }
    }

    static void inputNilaiMahasiswa() {
        GNilaiMahasiswa = new int[GJumlahMahasiswa][GMinggu];
        for (int i = 0; i < GJumlahMahasiswa; i++) {
            System.out.println("Nilai " + GNama[i]);
            for (int j = 0; j < GMinggu; j++) {
                GNilaiMahasiswa[i][j] = inputInt("Minggu ke-" + (j + 1));
            }
        }
    }

    static void tampilNilaiMahasiswa() {
        String line = "+----+" + "------+".repeat(GMinggu);
        String blank = "|    |";
        String minggu = "Minggu|".repeat(GMinggu);
        String ke = " ke %-2s|";
        String siswa = "|%-4s|";
        String nilai = " %3s  |";
        System.out.println(line);
        System.out.println(blank + minggu);
        System.out.print(blank);
        for (int i = 0; i < GMinggu; i++) {
            System.out.printf(ke, (i + 1));
        }
        System.out.println("\n" + line);
        for (int i = 0; i < GJumlahMahasiswa; i++) {
            System.out.printf(siswa, GNama[i]);
            for (int j = 0; j < GMinggu; j++) {
                System.out.printf(nilai, GNilaiMahasiswa[i][j]);
            }
            System.out.println("\n" + line);
        }
    }

    static void nilaiTertinggiMinggu() {
        int[] array = new int[GMinggu];
        for (int i = 0; i < GMinggu; i++) {
            for (int j = 0; j < GJumlahMahasiswa; j++) {
                array[i] += GNilaiMahasiswa[j][i];
            }
        }
        int max = 0;
        for (int value : array) {
            max = (value > max) ? value : max;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.println("Nilai tertinggi pada minggu ke-" + (i + 1) + " dengan nilai keseluruhan " + max);
                break;
            }
        }
    }

    static void nilaiTertinggi() {
        int max = 0;
        for (int[] row : GNilaiMahasiswa) {
            for (int value : row) {
                max = (value > max) ? value : max;
            }
        }
        for (int i = 0; i < GJumlahMahasiswa; i++) {
            for (int j = 0; j < GMinggu; j++) {
                if (GNilaiMahasiswa[i][j] == max) {
                    System.out.println("Nilai tertinggi diraih oleh " + GNama[i] + " pada minggu ke-" + (j + 1) + " dengan nilai " + max);
                    return;
                }
            }
        }
    }
}
