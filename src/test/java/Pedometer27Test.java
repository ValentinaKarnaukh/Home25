import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Pedometer27Test {

    @Test
    public void compareToTest() {
        Pedometer27 p1 = new Pedometer27();
        Pedometer27 p2 = new Pedometer27();

        p1.add(1, 100);
        p1.add(2, 90);

        p2.add(1, 70);
        p2.add(2, 110);

        int expected = 10;
        int actual = p1.compareTo(p2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void compareTest() {
        Pedometer27 p1 = new Pedometer27();
        Pedometer27 p2 = new Pedometer27();

        p1.add(1, 100);
        p1.add(-2, 50);
        p1.add(2, 85);
        p1.add(3, 15);

        p2.add(1, 80);
        p2.add(2, 45);
        p2.add(2, -45);
        p2.add(3, 15);
        p2.add(4, 25);
        p2.add(4, 25);

        PedometerDayComparator comparator = new PedometerDayComparator(20);
        int expected = -1;
        int actual = comparator.compare(p1, p2);
        Assertions.assertEquals(expected, actual);
    }
}
