import observers.Observable;
import observers.Observer;
import pizzas.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Order implements Observable {

    private final List<Observer> observers = new ArrayList<>();
    private final List<Pizza> pizzas = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
        notifyObservers(String.format("Pizza \"%s\" added to order", pizza.getName()));
    }

    public void completeOrder() {
        notifyObservers("Order completed. Ready for delivery.");
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.notify(message);
        }
    }
}
