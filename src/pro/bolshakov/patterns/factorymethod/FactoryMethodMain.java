package pro.bolshakov.patterns.factorymethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        createAndMoveTransport(new CarCreator());
        createAndMoveTransport(new BoatCreator());
    }

    private static void createAndMoveTransport(TransportCreator creator){
        Transport transport = creator.createTransport();
        transport.move();
    }
}
