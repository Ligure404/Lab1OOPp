import java.awt.*;

public class Saab95 extends Car{

    public boolean turboOn;
     // The car model name

    public Saab95(){
        super();
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
	    turboOn = false;
        modelName = "Saab95";
        stopEngine();

    }


    private void setTurboOn(){
	    turboOn = true;
    }

    private void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }



}
