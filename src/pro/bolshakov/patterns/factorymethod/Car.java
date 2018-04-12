package pro.bolshakov.patterns.factorymethod;

public class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Car is moving by road");
    }
}
