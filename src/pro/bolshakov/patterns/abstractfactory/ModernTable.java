package pro.bolshakov.patterns.abstractfactory;

public class ModernTable implements Table {
    @Override
    public void takeGlass() {
        System.out.println("Take glass from Modern Table");
    }
}
