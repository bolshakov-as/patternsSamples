package pro.bolshakov.patterns.builder;

public class ConcreteBuilderB implements Builder {
    private ProductB result;

    @Override
    public void reset() {
        result = new ProductB();
    }

    @Override
    public void buildStepA() {
        System.out.println("Builder B - step A");
        result.addAction("step A");
    }

    @Override
    public void buildStepB() {
        System.out.println("Builder B - step B");
        result.addAction("step B");
    }

    @Override
    public void buildStepC() {
        System.out.println("Builder B - step C");
        result.addAction("step C");
    }

    public ProductB getResult(){
        return result;
    }

}
