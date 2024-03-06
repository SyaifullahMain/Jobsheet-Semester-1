package LatihanPraktikum2;

public class ModelMahasiswa {
    private String nama;
    private String nim;
    private char jenisKelamin;
    private float ipk;

    public ModelMahasiswa() {
    }

    public ModelMahasiswa(String nama, String nim, char jenisKelamin, float ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public float getIpk() {
        return ipk;
    }
}
