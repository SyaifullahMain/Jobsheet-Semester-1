package TugasIndividu;

import java.util.Scanner;

public class Tugas2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan N = ");
    int N = input.nextInt();
    for (; 0 < N; N--) {
      for (int i = 0; i < N; i++)
        System.out.print("*");
      System.out.println();
    }
  }
}
