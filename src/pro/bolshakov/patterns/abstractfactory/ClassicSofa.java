package pro.bolshakov.patterns.abstractfactory;

public class ClassicSofa implements Sofa {
    @Override
    public void layDown() {
        System.out.println("Lay down on Classic Sofa");
    }
}
