package pro.bolshakov.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProduct {
    private List<String> actions = new ArrayList<>();
    public void addAction(String action){
        actions.add(action);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Actions : " + actions.toString();
    }
}
