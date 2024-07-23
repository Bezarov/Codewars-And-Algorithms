package Codewars;

import java.util.Arrays;

public class FindDuplicatesInString {
    public static void main(String[] args) {
        String[] strings = {"Hello", "Hello", "Java", "Tasks", "World"};
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[i] != null && strings[i].equals(strings[j]) && i != j) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        System.out.println(Arrays.toString(strings)
                .replaceAll("\\[", "{")
                .replaceAll("\\]", "}"));
    }
}