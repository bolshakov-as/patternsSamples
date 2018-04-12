package pro.bolshakov.patterns.builder;

public class BuilderMain {
    public static void main(String[] args) {

        ConcreteBuilderA builderA = new ConcreteBuilderA();
        DirectorOfBuilder director = new DirectorOfBuilder(builderA);
        director.makeActions(TypeStepsOfBuild.VARIANT_1);
        ProductA resultA = builderA.getResult();
        System.out.println(resultA);

        ConcreteBuilderB builderB = new ConcreteBuilderB();
        director.changeBuilder(builderB);
        director.makeActions(TypeStepsOfBuild.VARIANT_2);
        ProductB resultB = builderB.getResult();
        System.out.println(resultB);

    }
}
