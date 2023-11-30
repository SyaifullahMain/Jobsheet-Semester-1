import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bulan ke : ");
        int n = sc.nextInt();
        System.out.println("Jumlah Marmot : " + fibonacci(n));
    }
    static int fibonacci(int n) {
        return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}
