package pro.bolshakov.patterns.factorymethod;

public class Boat implements Transport {
    @Override
    public void move() {
        System.out.println("Boat's moving by sea");
    }
}
