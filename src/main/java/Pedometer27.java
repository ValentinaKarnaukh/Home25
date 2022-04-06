import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

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


    public void printAllByCriteria(Predicate<Integer> predicate) {
        for (int day : data.keySet()) {
            if (predicate.test(data.get(day))) {
                System.out.println("День " + day + " шагов " + data.get(day));
            }
        }
    }
    public Map<Integer, Boolean> printAllDaysByCriteria2(Predicate<Integer> criteria) {
        HashMap<Integer, Boolean> trueSteps = new HashMap<>();
        for  (int steps : data.keySet()) {
            if (criteria.test(data.get(steps))) {
                trueSteps.put(steps, true);
                System.out.println("День " + steps + " шагов " + data.get(steps));
            }
        }
        return trueSteps;
    }
}
