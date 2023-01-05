package Recursion;

public class EuclidGCD {
    public static double GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a > b) {
            return GCD(b, a % b);
        } else {
            return GCD(a, b % a);
        }
    }

    public static void main(String[] args) {
        int a = 22, b = 36;
        System.out.print(GCD(a, b));
    }
}
