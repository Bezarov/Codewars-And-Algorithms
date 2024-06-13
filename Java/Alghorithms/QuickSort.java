package Alghorithms;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(quickSort(new int[]{10, 2, 33, 18, 48, -10, 0, 193})));
    }


    public static int[] quickSort(int[] array) {
        if (array.length < 2)
            return array;

        int main = array[array.length / 2];
        int[] leftArray = new int[array.length - 1];
        int[] rightArray = new int[array.length - 1];
        int leftIndex = 0, rightIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == array.length / 2)
                continue;

            if (main > array[i]) {
                leftArray[leftIndex] = array[i];
                leftIndex++;
            } else {
                rightArray[rightIndex] = array[i];
                rightIndex++;
            }
        }
        leftArray = Arrays.copyOf(leftArray, leftIndex);
        rightArray = Arrays.copyOf(rightArray, rightIndex);
        leftArray = quickSort(leftArray);
        rightArray = quickSort(rightArray);

        int[] sortedArray = new int[array.length];
        System.arraycopy(leftArray, 0, sortedArray, 0, leftArray.length);
        sortedArray[leftArray.length] = main;
        System.arraycopy(rightArray, 0, sortedArray, leftArray.length + 1, rightArray.length);
        return sortedArray;
    }
}

