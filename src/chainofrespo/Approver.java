package chainofrespo;

abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract String handleRequest(ExpenseRequest request);
}

