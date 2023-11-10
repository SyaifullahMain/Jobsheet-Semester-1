package TugasIndividu;

import java.util.Scanner;

public class Tugas3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan N = ");
    int N = input.nextInt();
    String _print = "";
    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        if (N>9) 
            _print = (i == 1 || i == N || j == 1 || j == N) ? String.valueOf(N) : "  ";
        else
            _print = (i == 1 || i == N || j == 1 || j == N) ? String.valueOf(N)+" " : "  ";
        System.out.print(_print);
      }
      System.out.println();
    }
  }
}
