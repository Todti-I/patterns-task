package pizzas;

import java.util.Arrays;

public class MargheritaPizza extends Pizza {
    public MargheritaPizza() {
        super("Margherita", Arrays.asList("Tomato Sauce", "Mozzarella", "Basil"));
    }

    @Override
    public String getDescription() {
        return "Classic Margherita Pizza";
    }
}
