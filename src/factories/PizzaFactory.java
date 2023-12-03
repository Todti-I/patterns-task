package factories;

import pizzas.MargheritaPizza;
import pizzas.PepperoniPizza;
import pizzas.Pizza;

public class PizzaFactory {
    public Pizza createMargherita() {
        return new MargheritaPizza();
    }

    public Pizza createPepperoni() {
        return new PepperoniPizza();
    }
}
