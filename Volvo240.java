import java.awt.*;
import java.util.Dictionary;
import java.util.Hashtable;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;

    public Volvo240(){

        super(4, 100, Color.black, "Volvo240");
        stopEngine();

    }

    @Override
    public double speedFactor(){

        return getEnginePower() * 0.01 * trimFactor;

    }

    public static void main(String[] args) {

        Volvo240 car = new Volvo240();

        System.out.println(car.getNrDoors());

        car.startEngine();

        car.move();

        System.out.println(car.getColor());

        car.turnLeft();

        car.move();

        Dictionary <String, Double> pos = car.getPos();

        // print(f"x: {dict[x]}, y: {dict[y]"))
        System.out.print("x:"+ pos.get("x") + "   ");
        System.out.print("y:"+ pos.get("y"));

    }




}


