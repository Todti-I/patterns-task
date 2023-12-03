package notifications;

import observers.Observer;

public class AdminNotifications implements Observer {
    @Override
    public void notify(String message) {
        System.out.printf("Admin: %s\n", message);
    }
}
