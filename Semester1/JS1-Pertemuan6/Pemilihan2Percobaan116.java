import java.util.Scanner;
public class Pemilihan2Percobaan116 {
    public static void main(String[] args) {
        Scanner scanner16 = new Scanner(System.in);
        System.out.print("Masukan Tahun : ");
        int tahun = scanner16.nextInt();

        if ((tahun % 4) == 0) 
        {
            if ((tahun % 100) != 0) 
            {
                System.out.println("Tahun Kabisat");
            }
            else 
            {
                if ((tahun % 400) == 0) 
                {
                    System.out.println("Tahun Kabisat");
                } 
                else 
                {
                    System.out.println("Bukan Tahun Kabisat");
                }
            }
        } 
        else 
        {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}