package pro.bolshakov.patterns.builder;

public interface Builder {
    void reset();
    void buildStepA();
    void buildStepB();
    void buildStepC();
}
