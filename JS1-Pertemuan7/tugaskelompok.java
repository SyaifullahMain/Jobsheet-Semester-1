import java.util.Scanner;
public class tugaskelompok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String user;
        String pass;
        for ( int i = 1; i <= 3; i++) {
            System.out.print("Username : ");
            user = scan.nextLine();
            System.out.print("Password : ");
            pass = scan.nextLine();
            if (user.equals("user") && pass.equals("pass")) {
                System.out.println("Berhasil login");
                break;
            } else System.out.println("Username dan password salah");
            if (i==3) System.out.println("Anda salah input 3x silahkan tunggu 5 menit");
        }
    }
}
