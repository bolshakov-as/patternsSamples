package pro.bolshakov.patterns.factorymethod;

public class BoatCreator extends TransportCreator {
    @Override
    public Transport createTransport() {
        System.out.println("Creator's making a boat");
        return new Boat();
    }
}
