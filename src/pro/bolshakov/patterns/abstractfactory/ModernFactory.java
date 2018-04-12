package pro.bolshakov.patterns.abstractfactory;

public class ModernFactory extends AbstractFurnitureFactory {

    @Override
    public Chair createChair() {
        System.out.println("Modern Factory is creating a chair");
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Modern Factory is creating a table");
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Modern Factory is creating a sofa");
        return new ModernSofa();
    }
}
