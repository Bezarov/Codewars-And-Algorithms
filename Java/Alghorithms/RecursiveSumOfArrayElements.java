package Alghorithms;

public class RecursiveSumOfArrayElements {
    public static void main(String[] args) {
        System.out.println(sumArrayElement(new int[]{1, 2, 3}, 0));
    }

    public static int sumArrayElement(int[] array, int index) {
        if (index == array.length - 1)
            return array[index];
        return array[index] += sumArrayElement(array, index + 1);
    }
}
