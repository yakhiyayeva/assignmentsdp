package state;

// Concrete State: New
class NewState implements State {
    @Override
    public void handleOrder(Order order, String action) {
        switch (action) {
            case "pay":
                System.out.println("Order paid.");
                order.setState(new PaidState());
                break;
            case "ship":
                System.out.println("Order cannot be shipped; it is not paid.");
                break;
            case "deliver":
                System.out.println("Order cannot be delivered; it is not shipped.");
                break;
            case "cancel":
                System.out.println("Order cancelled.");
                order.setState(new CancelledState());
                break;
            default:
                System.out.println("Invalid action for this state.");
        }
    }
}








