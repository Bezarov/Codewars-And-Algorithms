package Codewars;

import java.util.Arrays;

public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(999));
    }

    public static int persistence(long n) {
        int count = 0;
        while (n >= 10) {
            count++;
            n = Arrays.stream(String.valueOf(n).split(""))
                    .limit(String.valueOf(n).length())
                    .mapToLong(Long::parseLong)
                    .reduce(1, (a, b) -> a * b);
        }
        return count;
    }
}

