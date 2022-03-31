import java.util.HashMap;
import java.util.Map;

public class Pedometer27 implements Comparable<Pedometer27> {

    private Map<Integer, Integer> data = new HashMap<>();
    private int max = 0;

    public int add(int day, int steps) {
        if (day <= 0 || steps < 0) {
            return max = -1;
        } else {
            int valueSteps = data.getOrDefault(day, 0) + steps;
            data.put(day, valueSteps);
            if (max < valueSteps) {
                max = valueSteps;
            }
            return max - steps + 1;
        }
    }

    public int sum() {
        int sum = 0;
        for (int steps : data.keySet()) {
            sum += data.get(steps);
        }
        return sum;
    }

    @Override
    public int compareTo(Pedometer27 pedometer) {
        return sum() - pedometer.sum();

    }

    public int dayMoreMin(int minSteps) {
        int response = 0;
        for (int steps : data.values()) {
            if (steps > minSteps) {
                response++;
            }
        }
        return response;
    }
}
