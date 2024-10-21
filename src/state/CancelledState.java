package state;

class CancelledState implements State {
    @Override
    public void handleOrder(Order order, String action) {
        switch (action) {
            case "pay":
            case "ship":
            case "deliver":
                System.out.println("Order cannot be processed; it is cancelled.");
                break;
            case "cancel":
                System.out.println("Order is already cancelled.");
                break;
            default:
                System.out.println("Invalid action for this state.");
        }
    }
}
