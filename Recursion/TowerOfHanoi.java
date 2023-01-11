package Recursion;

public class TowerOfHanoi {
    public static void hanoi(int n, char source, char temp, char dest) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + source + " to " + dest);
            return;
        }
        hanoi(n - 1, source, dest, temp);
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        hanoi(n - 1, temp, source, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'B', 'C');
    }
}
