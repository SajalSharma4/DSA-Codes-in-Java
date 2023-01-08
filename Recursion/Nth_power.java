package Recursion;

public class Nth_power {
    public static float powerValue(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * powerValue(num, pow - 1);
    }

    public static void main(String[] args) {
        int num = 2;
        int pow = 5;
        System.out.println(powerValue(num, pow));
    }
}
