package pizzas;

import java.util.Arrays;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        super("Pepperoni", Arrays.asList("Tomato Sauce", "Mozzarella", "Pepperoni"));
    }

    @Override
    public String getDescription() {
        return "Spicy Pepperoni Pizza";
    }
}
