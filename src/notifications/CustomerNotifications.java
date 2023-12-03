package notifications;

import observers.Observer;

public class CustomerNotifications implements Observer {
    private final String name;

    public CustomerNotifications(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.printf("%s: %s\n", name, message);
    }
}
