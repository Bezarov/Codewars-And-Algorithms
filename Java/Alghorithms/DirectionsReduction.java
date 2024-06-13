package Alghorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectionsReduction {
    public static void main(String[] args) {
        String[] blabla = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        System.out.println(Arrays.toString(dirReduc(blabla)));

    }

    public static String[] dirReduc(String[] arr) {
        List<String> result = new ArrayList<>();
        for (String s : arr) {
            if (!result.isEmpty() &&
                    ((result.get(result.size() - 1).equals("NORTH") && s.equals("SOUTH"))
                            || (result.get(result.size() - 1).equals("SOUTH") && s.equals("NORTH"))
                            || (result.get(result.size() - 1).equals("WEST") && s.equals("EAST"))
                            || (result.get(result.size() - 1).equals("EAST") && s.equals("WEST"))))
                result.remove(result.size() - 1);
            else result.add(s);
        }
        return result.toArray(new String[0]);
    }
}
