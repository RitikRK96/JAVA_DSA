import java.util.Scanner;

public class FactorialRecursive {
    public static int FactorialRecursives(int n) {
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * FactorialRecursives(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to compute its factorial: ");
        int n = sc.nextInt();
        int result = FactorialRecursives(n);
        System.out.println("The factorial of " + n + " is: " + result);
        sc.close();
    }
}
