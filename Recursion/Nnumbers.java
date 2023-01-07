package Recursion;

public class Nnumbers {
    public static void one_to_n(int n) {
        if (n == 0)
            return;
        one_to_n(n - 1);
        System.out.print(n + " ");
    }

    public static void n_to_one(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        n_to_one(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print("one to n : ");
        one_to_n(n);
        System.out.println();
        System.out.print("n to one : ");
        n_to_one(n);
        System.out.println();

    }
}
