package Codewars.LambdaAndStream;

import java.util.Arrays;

/*
Task: Counting words in a line
Write a program that reads the number of words in a line using streams.

Convert text into a stream of words.
Adjust your word count using streams and the count method.
 */

public class CountNumberOfWordsInString {
    public static void main(String[] args) {
        String sentence = "Hello my friend a b i'm bzz";
        System.out.println(countWords(sentence));
    }
    public static long countWords(String sentence){
        return Arrays.stream(sentence.split(" ")).filter(e -> e.length() > 1).count();
    }
}
