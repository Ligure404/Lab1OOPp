import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;
public class CarTest {

    @Test
    public void gasBrakeTest() {
        Car c = new Saab95();
        c.startEngine();
        c.gas(100);
        assertEquals(1.1, c.getCurrentSpeed(), 0.0);
        c.brake(100);
        assertEquals(0.1, c.getCurrentSpeed(), 0.0);
        c.gas(1000000000);
        assertEquals(125, c.getCurrentSpeed(), 0.0);
        c.brake(100000000);
        assertEquals(0, c.getCurrentSpeed(), 0.0);
    }

    @Test
    public void moveTurnTest() {

        Volvo240 car = new Volvo240();

        car.startEngine();

        car.move();

        car.turnLeft();

        car.move();

        double[] pos = car.getPos();

        assertEquals(0.1, pos[0], 0);

        assertEquals(0.1, pos[1], 0);
    }

    @Test
    public void colorTest() {

        Saab95 car = new Saab95();

        car.startEngine();

        assertEquals(Color.red, car.getColor());

        car.setColor(Color.black);

        assertEquals(Color.black, car.getColor());

    }

    @Test
    public void turboTest() {


        Saab95 car = new Saab95();
        car.startEngine();

        assertEquals(1.25, car.speedFactor());

        car.setTurboOn();

        assertEquals(1.625, car.speedFactor());
    }
}