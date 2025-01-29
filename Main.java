public class Main {

    public static void main(String[] args){
        Volvo240 v = new Volvo240();
        v.startEngine();
        v.gas(1);
        v.gas(1);
        v.gas(1);
        v.gas(1);
        v.gas(1);
        v.gas(1);
        v.move();
        v.turnLeft();
        v.move();
        for (int i = 0; i<2; i++) {
            System.out.println(v.getPos()[i]);
        }
        v.stopEngine();


    }
}
