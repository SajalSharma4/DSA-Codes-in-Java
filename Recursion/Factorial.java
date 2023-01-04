package Recursion;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int a = 3;
        int x = factorial(a);
        System.out.println("the factorial of " + a + " is : " + x);
    }
}
