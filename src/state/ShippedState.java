package state;

class ShippedState implements State {
    @Override
    public void handleOrder(Order order, String action) {
        switch (action) {
            case "pay":
                System.out.println("Order is already paid.");
                break;
            case "ship":
                System.out.println("Order is already shipped.");
                break;
            case "deliver":
                System.out.println("Order delivered.");
                order.setState(new DeliveredState());
                break;
            case "cancel":
                System.out.println("Order cannot be cancelled; it is already shipped.");
                break;
            default:
                System.out.println("Invalid action for this state.");
        }
    }
}
