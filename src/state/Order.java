package state;

class Order {
    private State state;

    public Order() {
        state = new NewState(); // Initial state is New
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handleAction(String action) {
        state.handleOrder(this, action);
    }
}

