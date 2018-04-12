package pro.bolshakov.patterns.abstractfactory;

public class ClassicFactory extends AbstractFurnitureFactory {
    @Override
    public Chair createChair() {
        System.out.println("Classic Factory is creating a chair");
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Classic Factory is creating a table");
        return new ClassicTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Classic Factory is creating a sofa");
        return new ClassicSofa();
    }
}
