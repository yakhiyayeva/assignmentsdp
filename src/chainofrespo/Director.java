package chainofrespo;

class Director extends Approver {
    @Override
    public String handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 10000) {
            return "Director approved the expense for " + request.getPurpose() + " of $" + request.getAmount();
        } else if (nextApprover != null) {
            return nextApprover.handleRequest(request);
        }
        return "Request could not be processed.";
    }
}