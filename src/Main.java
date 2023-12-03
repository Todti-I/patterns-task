import factories.PizzaFactory;
import notifications.AdminNotifications;
import notifications.CustomerNotifications;
import notifications.StaffNotifications;
import observers.Observer;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Order order = new Order();

        Observer customerNotifications = new CustomerNotifications("John");
        Observer staffNotifications = new StaffNotifications(777);
        Observer adminNotifications = new AdminNotifications();

        System.out.println("-----Add observers-----");
        order.addObserver(customerNotifications);
        order.addObserver(staffNotifications);
        order.addObserver(adminNotifications);

        System.out.println("-----Add pizzas-----");
        order.addPizza(pizzaFactory.createPepperoni());
        order.addPizza(pizzaFactory.createMargherita());

        System.out.println("-----Remove observer-----");
        order.removeObserver(adminNotifications);

        System.out.println("-----Complete order-----");
        order.completeOrder();
    }
}