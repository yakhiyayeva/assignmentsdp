package chainofrespo;

public class Main {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        // Test cases
        ExpenseRequest[] requests = {
                new ExpenseRequest(500, "Team lunch"),
                new ExpenseRequest(3000, "Office equipment"),
                new ExpenseRequest(7000, "New servers"),
                new ExpenseRequest(15000, "Company retreat")
        };

        // Process each request
        for (ExpenseRequest req : requests) {
            System.out.println(approvalChain.processRequest(req));
        }
    }
}

