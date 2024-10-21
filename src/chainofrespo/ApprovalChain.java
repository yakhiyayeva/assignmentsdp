package chainofrespo;

class ApprovalChain {
    private Approver approverChain;

    public ApprovalChain() {
        // Setup the chain of responsibility
        TeamLead teamLead = new TeamLead();
        Manager manager = new Manager();
        Director director = new Director();
        CEO ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        approverChain = teamLead;
    }

    public String processRequest(ExpenseRequest request) {
        return approverChain.handleRequest(request);
    }
}

