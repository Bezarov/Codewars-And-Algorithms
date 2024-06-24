package Codewars.LambdaAndStream;

import java.util.*;
/*
Create a list of integers and find the maximum and minimum value and their indexes using streams.

Use the max method to find the maximum value.
Use the min method to find the minimum value.
 */

public class FindMaxAndMinNumberInArray {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 7, 6, 3, 10, 13, 0, 16);
        System.out.println(findMaxAndMin(array));
    }

    public static Map<Integer, Integer> findMaxAndMin(List<Integer> array) {
        Map<Integer, Integer> result = new HashMap<>();
        array.stream().max(Integer::compare).map(n -> result.put(array.indexOf(n), n));
        array.stream().min(Integer::compare).map(n -> result.put(array.indexOf(n), n));
        return result;
    }
}
