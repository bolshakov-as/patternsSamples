package pro.bolshakov.patterns.abstractfactory;

public class ClassicChair implements Chair {
    @Override
    public void sitDown() {
        System.out.println("Sit down on classic chair");
    }
}
