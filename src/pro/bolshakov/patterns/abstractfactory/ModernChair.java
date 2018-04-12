package pro.bolshakov.patterns.abstractfactory;

public class ModernChair implements Chair {
    @Override
    public void sitDown() {
        System.out.println("Sit don on Modern chair");
    }
}
