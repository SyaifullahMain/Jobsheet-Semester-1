package LatihanPraktikum2;

import java.util.Arrays;
import java.util.Scanner;

public class ViewMahasiswa {
    private Scanner scanner;
    private ServMahasiwa servMahasiwa;

    public ViewMahasiswa(Scanner scanner, ServMahasiwa servMahasiwa) {
        this.scanner = scanner;
        this.servMahasiwa = servMahasiwa;
    }

    public void mainView() {
        int pilihan = 0;
        do {
            System.out.println("1. Insert Mahasiswa");
            System.out.println("2. View Mahasiswa");
            System.out.println("3. View IPK");
            System.out.println("4. Exit");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1 -> insertMahasiswa();
                case 2 -> viewMahasiswa();
                case 3 -> viewIpk();
                case 4 -> System.out.println("Goodbye");
                default -> System.out.println("Invalid input");
            }
        } while (pilihan != 4);
    }

    public void insertMahasiswa() {
        System.out.print("Masukan Nama: ");
        String nama = scanner.next();
        System.out.print("Masukan NIM: ");
        String nim = scanner.next();
        System.out.print("Masukan Jenis Kelamin: ");
        char kelamin = scanner.next().charAt(0);
        System.out.print("Masukan IPK: ");
        float ipk = scanner.nextFloat();
        servMahasiwa.insertMahasiswa(new ModelMahasiswa(nama, nim, kelamin, ipk));
    }

    public void viewMahasiswa() {
        ModelMahasiswa[] mahasiswa = servMahasiwa.getAllMahasiswa();
        System.out.println("=====================================");
        for (int i = 0; i < mahasiswa.length; i++) {
            if (mahasiswa[i] != null) {
                System.out.println("Data Mahasiswa ke-" + (i + 1));
                System.out.println("Nama: " + mahasiswa[i].getNama());
                System.out.println("NIM: " + mahasiswa[i].getNim());
                System.out.println("Kelamin: " + mahasiswa[i].getJenisKelamin());
                System.out.println("IPK: " + mahasiswa[i].getIpk());
                System.out.println("=====================================");
            }
        }
    }

    public void viewIpk() {
        ModelMahasiswa[] mahasiswa = servMahasiwa.getAllMahasiswa();
        float nilaiTertinggi = 0;
        for (ModelMahasiswa mhs : mahasiswa) {
            if (mhs == null) break;;
            if (mhs.getIpk() > nilaiTertinggi) {
                nilaiTertinggi = mhs.getIpk();
            }
        }
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);

        float averageIpk = 0;
        int count = 0;
        for (ModelMahasiswa mhs : mahasiswa) {
            if (mhs == null) break;
            averageIpk += mhs.getIpk();
            count++;
        }
        averageIpk /= count;
        System.out.println("Rata-rata IPK: " + averageIpk);
////        float nilaiTertinggi = Arrays.stream(mahasiswa).map(ModelMahasiswa::getIpk).max(Float::compare).get();
//        double nilaiTertinggi = Arrays.stream(mahasiswa).mapToDouble(ModelMahasiswa::getIpk).max().getAsDouble();
//        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
//
////        float averageIpk = Arrays.stream(mahasiswa).map(ModelMahasiswa::getIpk).reduce(0f, Float::sum) / mahasiswa.length;
//        double averageIpk = Arrays.stream(mahasiswa).mapToDouble(ModelMahasiswa::getIpk).average().getAsDouble();
//        System.out.println("Rata-rata IPK: " + averageIpk);
    }
}
