import java.awt.*;

public class Car implements Movable{

    public int nrDoors;
    public double enginePower;
    public double currentSpeed;
    public Color color;
    public String modelName;
    public double x;
    public double y;
    public String direction;

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public double speedFactor(){
        return enginePower * 0.01;
    }

    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    public void move() {
        if (direction.equals("f")) {y += getCurrentSpeed();}
        else if (direction.equals("b")) {y -= getCurrentSpeed();}
        else if (direction.equals("l")) {x -= getCurrentSpeed();}
        else if (direction.equals("r")) {x += getCurrentSpeed();}
    }

    public void turnLeft() {
        if (direction.equals("f")) {direction = "l";}
        if (direction.equals("l")) {direction = "b";}
        if (direction.equals("b")) {direction = "r";}
        if (direction.equals("r")) {direction = "f";}
    }

    public void turnRight() {
        if (direction.equals("f")) {direction = "r";}
        if (direction.equals("r")) {direction = "b";}
        if (direction.equals("b")) {direction = "l";}
        if (direction.equals("l")) {direction = "f";}
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }


}
