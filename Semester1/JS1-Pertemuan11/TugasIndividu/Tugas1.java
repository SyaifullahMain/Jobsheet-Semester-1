package TugasIndividu;

import java.util.Scanner;

public class Tugas1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan N = ");
    int N = input.nextInt();
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N-i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
