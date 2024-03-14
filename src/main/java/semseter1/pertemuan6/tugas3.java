package semseter1.pertemuan6;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String level, user, pass;
        System.out.println("== SISTEM AKADEMIK ==");
        System.out.println("1. Admin");
        System.out.println("2. Dosen");
        System.out.println("3. Mahasiswa");
        System.out.println("x. Keluar");
        System.out.print("PILIH MASUK SEBAGAI : ");
        level = input.nextLine();
        
        if (level.equalsIgnoreCase("x")) {
            System.out.println("KELUAR");
        } if (level.equals("1")){
            System.out.println("== SISTEM AKADEMIK ADMIN JTI ==");
            System.out.print("USERNAME : ");
            user = input.nextLine();
            System.out.print("PASSWORD : ");
            pass = input.nextLine();
            if ((user.equals("admin")) && (pass.equals("admin"))) {
                System.out.println("DASHBOARD ADMIN");
            } else {
                System.out.println("Username dan password salah");
            }
        } else if (level.equals("2")){
            System.out.println("== SISTEM AKADEMIK DOSEN JTI ==");
            System.out.print("USERNAME : ");
            user = input.nextLine();
            System.out.print("PASSWORD : ");
            pass = input.nextLine();
            if ((user.equals("dosen")) && (pass.equals("dosen"))) {
                System.out.println("DASHBOARD DOSEN");
            } else {
                System.out.println("Username dan password salah");
            }
        } else if (level.equals("3")){
            System.out.println("== SISTEM AKADEMIK MAHASISWA JTI ==");
            System.out.print("USERNAME : ");
            user = input.nextLine();
            System.out.print("PASSWORD : ");
            pass = input.nextLine();
            if ((user.equals("mahasiswa")) && (pass.equals("mahasiswa"))) {
                System.out.println("DASHBOARD MAHASISWA");
            } else {
                System.out.println("Username dan password salah");
            }
        } else {
            System.out.println("Perintah tidak dimengerti");
        }
    }
}
