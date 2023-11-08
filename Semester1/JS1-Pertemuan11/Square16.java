import java.util.Scanner;

public class Square16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai N = ");
        int N = sc.nextInt();
        for (int Outer = 1; Outer <= N; Outer++) {
            for (int i = 1; i <= N; i++) {
                System.out.print("*");           
            }
            System.out.println();
        }
    }
}