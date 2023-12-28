import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 1, 1, 4, 5, 6, 7, 7, 7));

        HashMap<Integer, Integer> repeatedNumbers = hashMapTask.findRepeatedNumbers(numbers);

        System.out.println("Numbers and their Counts:");
        for (Integer key : repeatedNumbers.keySet()) {
            System.out.println(key + " = " + repeatedNumbers.get(key));
        }
    }
}
