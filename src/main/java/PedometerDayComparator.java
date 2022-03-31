import java.util.Comparator;

public class PedometerDayComparator implements Comparator<Pedometer27> {
    private int minSteps;

    public PedometerDayComparator(int minSteps) {
        this.minSteps = minSteps;
    }

    @Override
    public int compare(Pedometer27 p1, Pedometer27 p2) {
        return p1.dayMoreMin(minSteps) - p2.dayMoreMin(minSteps);
    }
}
