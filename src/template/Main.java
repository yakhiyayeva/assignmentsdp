package template;

public class Main {
    public static void main(String[] args) {
        // Create the reporting system
        ReportingSystem reportingSystem = new ReportingSystem();

        // Generate a PDF report
        System.out.println("Generating PDF Report:");
        reportingSystem.setReportGenerator(new PDFReportGenerator());
        reportingSystem.generateReport();

        // Generate an HTML report
        System.out.println("Generating HTML Report:");
        reportingSystem.setReportGenerator(new HTMLReportGenerator());
        reportingSystem.generateReport();

        // Generate a Plain Text report
        System.out.println("Generating Plain Text Report:");
        reportingSystem.setReportGenerator(new PlainTextReportGenerator());
        reportingSystem.generateReport();
    }
}

