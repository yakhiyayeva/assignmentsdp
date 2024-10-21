package state;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Try to ship the order (should fail)
        order.handleAction("ship");

        // Pay for the order
        order.handleAction("pay");

        // Ship the order
        order.handleAction("ship");

        // Deliver the order
        order.handleAction("deliver");

        // Try to cancel the order (should fail)
        order.handleAction("cancel");

        // Create a new order and cancel it
        Order anotherOrder = new Order();
        anotherOrder.handleAction("cancel");
    }
}

