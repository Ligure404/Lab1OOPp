import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {

    @org.junit.Test
    public void incrementSpeed() {
        Car c = new Volvo240();
        c.startEngine();
        c.incrementSpeed(5);
        assertEquals(6.35, c.getCurrentSpeed(), 0.01);
        c.incrementSpeed(900000);
        assertEquals(100, c.getCurrentSpeed(), 0.01);
    }

    @org.junit.Test
    public void decrementSpeed() {
        Car c = new Volvo240();
        c.startEngine();
        c.incrementSpeed(5);
        c.decrementSpeed(5);
        assertEquals(0.1, c.getCurrentSpeed(), 0.01);
        c.decrementSpeed(29999);
        assertEquals(0, c.getCurrentSpeed(), 0.01);

    }

    @org.junit.Test
    public void gas() {
    }

    @org.junit.Test
    public void brake() {
    }
}