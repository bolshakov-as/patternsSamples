package pro.bolshakov.patterns.abstractfactory;

public class ClassicTable implements Table {
    @Override
    public void takeGlass() {
        System.out.println("Take glass from Classic Table");
    }
}
