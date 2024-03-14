package semseter1.pertemuan11;

import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai N = ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
