package pro.bolshakov.patterns.abstractfactory;

public abstract class AbstractFurnitureFactory {
    abstract public Chair createChair();
    abstract public Table createTable();
    abstract public Sofa createSofa();
}
