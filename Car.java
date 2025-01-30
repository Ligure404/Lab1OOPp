import java.awt.*;

public abstract class Car implements Movable{
    //Abstrakt class, kan inte skapa instanser. Tanken är att det inte ska gå att skapa en generisk bil

    private final int nrDoors;
    private final double enginePower;
    private double currentSpeed;
    private Color color;
    private final String modelName;
    private double x;
    private double y;
    private String direction;

    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        //Definierar instansvariabler
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;

        this.x = 0;
        this.y = 0;
        this.direction = "north";

        stopEngine();

    }
    public String getModel() { return modelName;}

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void setCurrentSpeed(double value) {currentSpeed = value;}

    public Color getColor() {
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

    private void incrementSpeed(double amount){
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));
    }

    private void decrementSpeed(double amount){
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }

    public double[] getPos(){
        double[] pos = new double[2];
        pos[0] = x;
        pos[1] = y;
        return pos;
    }

    //Rör sig enligt ett x/y grid beroende på riktning
    public void move() {
        switch (direction) {
            case "north" -> y += getCurrentSpeed();
            case "south" -> y -= getCurrentSpeed();
            case "west" -> x -= getCurrentSpeed();
            case "east" -> x += getCurrentSpeed();
        }
    }

    public void turnLeft() {
        switch (direction) {
            case "north" -> direction = "west";
            case "west" -> direction = "south";
            case "south" -> direction = "east";
            case "east" -> direction = "north";
        }
    }

    public void turnRight() {
        switch (direction) {
            case "north" -> direction = "east";
            case "east" -> direction = "south";
            case "south" -> direction = "west";
            case "west" -> direction = "north";
        }
    }

    //Gas och brake ska bara kunna ta värden mellan 0 och 1
    public void gas(double amount){
        if (0 <= amount && amount <= 1) {incrementSpeed(amount);}
    }

    public void brake(double amount){
        if (0 <= amount && amount <= 1) {decrementSpeed(amount);}
    }


}
