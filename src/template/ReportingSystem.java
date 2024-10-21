package template;

// Reporting system to use different report generators
public class ReportingSystem {

    private ReportGenerator reportGenerator;

    // Set the type of report generator (Strategy pattern-like behavior)
    public void setReportGenerator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    // Generate the report using the currently set generator
    public void generateReport() {
        if (reportGenerator != null) {
            reportGenerator.generateReport();
        } else {
            System.out.println("No report generator set.");
        }
    }
}

