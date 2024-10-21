package chainofrespo;

class Manager extends Approver {
    @Override
    public String handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 5000) {
            return "Manager approved the expense for " + request.getPurpose() + " of $" + request.getAmount();
        } else if (nextApprover != null) {
            return nextApprover.handleRequest(request);
        }
        return "Request could not be processed.";
    }
}

