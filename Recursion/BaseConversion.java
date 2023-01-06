package Recursion;

public class BaseConversion {
    public static void convertbase(int n, int base) {
        if (n == 0) {
            return;
        }
        convertbase(n / base, base);

        int rem = n % base;
        if (rem < 10) {
            System.out.print(rem);
        } else {
            System.out.print((char) (rem - 10 + 'A'));
        }
    }

    public static void main(String[] args) {
        int n = 15;
        convertbase(n, 2);
        System.out.println();
        convertbase(n, 8);
        System.out.println();

        convertbase(n, 16);
    }
}
