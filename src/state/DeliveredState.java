package state;

class DeliveredState implements State {
    @Override
    public void handleOrder(Order order, String action) {
        switch (action) {
            case "pay":
                System.out.println("Order is already paid.");
                break;
            case "ship":
                System.out.println("Order cannot be shipped; it is already delivered.");
                break;
            case "deliver":
                System.out.println("Order is already delivered.");
                break;
            case "cancel":
                System.out.println("Order cannot be cancelled; it is already delivered.");
                break;
            default:
                System.out.println("Invalid action for this state.");
        }
    }
}
