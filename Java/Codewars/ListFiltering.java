package Codewars;

import java.util.List;

public class ListFiltering {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, "a", "b", 0, 15, "1", "1234")));
    }

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(e -> String.valueOf(e).matches("\\d+")).toList();
    }
}
