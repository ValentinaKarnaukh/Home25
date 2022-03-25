import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PedometerTest {

    @Test
    public void test() {
        Pedometer pedometer = new Pedometer();
        pedometer.add(1, 30);
        pedometer.add(2, 25);
        pedometer.add(2, 12);
        pedometer.add(0, 33);
        pedometer.add(3, 75);
        pedometer.add(4, 21);
        pedometer.add(-4, 25);
        pedometer.add(4, -30);
        pedometer.add(5, 54);

        int expected = 76;
        int actual = pedometer.add(1, 0);

        Assertions.assertEquals(expected, actual);
    }
}
