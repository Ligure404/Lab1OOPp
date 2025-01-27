import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {

    @org.junit.Test
    public void gas() {
        Car c = new Saab95();
        c.startEngine();
        c.gas(20);
    }

    @org.junit.Test
    public void brake() {
    }
}