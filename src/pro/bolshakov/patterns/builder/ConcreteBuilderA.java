package pro.bolshakov.patterns.builder;

public class ConcreteBuilderA implements Builder {

    private ProductA result;

    @Override
    public void reset() {
        result = new ProductA();
    }

    @Override
    public void buildStepA() {
        System.out.println("Builder A - step A");
        result.addAction("Step A");
    }

    @Override
    public void buildStepB() {
        System.out.println("Builder A - step B");
        result.addAction("Step B");
    }

    @Override
    public void buildStepC() {
        System.out.println("Builder A - step C");
        result.addAction("Step C");
    }

    public ProductA getResult(){
        return result;
    }

}
