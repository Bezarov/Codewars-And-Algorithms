package Alghorithms;

public class RecursiveFactorial {
    public static void main(String[] args) {
        System.out.println(factortial(3));

    }
    public static int factortial(int n) {
        if (n == 1)
            return n;
        return n * factortial(n - 1);
    }
}
