package Recursion;

public class SumOfDigits {
    public static int Sum_Of_Digits(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return Sum_Of_Digits(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(Sum_Of_Digits(n));
    }
}
