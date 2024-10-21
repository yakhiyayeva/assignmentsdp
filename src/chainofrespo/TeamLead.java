package chainofrespo;

class TeamLead extends Approver {
    @Override
    public String handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= 1000) {
            return "TeamLead approved the expense for " + request.getPurpose() + " of $" + request.getAmount();
        } else if (nextApprover != null) {
            return nextApprover.handleRequest(request);
        }
        return "Request could not be processed.";
    }
}
