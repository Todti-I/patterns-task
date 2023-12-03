package pizzas;

import java.util.List;

public abstract class Pizza {
    private final String name;
    private final List<String> ingredients;

    public Pizza(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public abstract String getDescription();
}
