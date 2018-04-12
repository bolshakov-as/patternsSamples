package pro.bolshakov.patterns.factorymethod;

public class CarCreator extends TransportCreator {
    @Override
    public Transport createTransport() {
        System.out.println("Creator's making a car");
        return new Car();
    }
}
