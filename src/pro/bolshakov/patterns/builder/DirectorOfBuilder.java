package pro.bolshakov.patterns.builder;

public class DirectorOfBuilder {
    private Builder builder;

    public DirectorOfBuilder(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder){
        this.builder = builder;
    }

    public void makeActions(TypeStepsOfBuild typeStepsOfBuild){
        builder.reset();
        if(typeStepsOfBuild == TypeStepsOfBuild.VARIANT_1){
            builder.buildStepA();
            builder.buildStepB();
        }
        else if (typeStepsOfBuild == TypeStepsOfBuild.VARIANT_2){
            builder.buildStepB();
            builder.buildStepC();
        }
    }

}
