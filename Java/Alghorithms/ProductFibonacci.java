package Alghorithms;

import java.util.Arrays;

public class ProductFibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(4895)));
    }

    public static long[] productFib(long prod) {
        long i = 0, j = 1;
        while (i * j < prod) {
            i = i + j;
            if (i * j == prod)
                return new long[]{j, i, 1};
            if (i * j > prod)
                return new long[]{j, i, 0};
            j = i + j;
            if (i * j == prod)
                return new long[]{i, j, 1};
            if (i * j > prod)
                return new long[]{i, j, 0};
        }
        return new long[]{0, 0, 0};
    }
}
