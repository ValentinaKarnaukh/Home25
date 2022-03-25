import java.util.HashMap;
import java.util.Map;

public class Pedometer {

    private Map<Integer, Integer> data = new HashMap<>();
    private int max = 0;

    public int add(int day, int steps) {
        if (day <= 0 || steps < 0) {
            return -1;
        } else {
            int valueSteps = data.getOrDefault(day, 0) + steps;
            data.put(day, valueSteps);
            if (max < valueSteps) {
                max = valueSteps;
            }
            return max - steps + 1;
        }
    }
}
