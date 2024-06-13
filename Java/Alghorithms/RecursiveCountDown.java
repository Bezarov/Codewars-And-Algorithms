package Alghorithms;

public class RecursiveCountDown {
    public static void main(String[] args) {
        countDown(3);
    }

    public static void countDown(int n) {
        if (n <= 0)
            return;
        System.out.println(n);
        countDown(n - 1);
    }
}
