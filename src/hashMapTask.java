import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class hashMapTask {
    public static HashMap<Integer, Integer> findRepeatedNumbers(ArrayList<Integer> numbers) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (Integer number : numbers) {
            counts.put(number, counts.getOrDefault(number, 0) + 1);
        }
        return counts;
    }
}
