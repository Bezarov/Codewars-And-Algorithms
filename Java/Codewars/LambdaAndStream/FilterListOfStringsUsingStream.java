package Codewars.LambdaAndStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Task:   Filtering and sorting the list
        Create a list of strings and do the following:
        Filter the words, leaving only those that begin with the letter "a".
        Sort the remaining rows alphabetically.
        Convert all strings to uppercase.
        Collect the result into a new list and display it on the screen.
 */


public class FilterListOfStringsUsingStream {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Abigail", "Admin", "Academic",
                "Animation", "Boss", "Aannotation"));
        listFiltering(words);
    }
    public static void listFiltering(List<String> words){
        List<String> result = words.stream()
                .filter(word -> word.startsWith("A"))
                .sorted()
                .map(String::toUpperCase)
                .toList();
        System.out.println(result);
    }
}
