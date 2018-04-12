package pro.bolshakov.patterns.abstractfactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        System.out.println("--- Modern Factory ---");
        createFurniture(new ModernFactory());
        System.out.println("--- Classic Factory ---");
        createFurniture(new ClassicFactory());
    }

    private static void createFurniture(AbstractFurnitureFactory factory){
        Chair chair = factory.createChair();
        chair.sitDown();
        Sofa sofa = factory.createSofa();
        sofa.layDown();
        Table table = factory.createTable();
        table.takeGlass();
    }

}
