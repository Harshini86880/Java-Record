import java.util.Scanner;

public class Evenfibonnaci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = sc.nextInt();

        System.out.print("Prime numbers that are part of the Fibonacci series: ");
        isFibonacci(n);
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false; // 
            }
        }
        return true; // 
    }

    public static void isFibonacci(int num) {
        int a = 0, b = 1;
        while (a <= num) {
            if (isPrime(a)) {
                System.out.print(a + " "); 
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); 
    }
}
