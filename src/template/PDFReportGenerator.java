package template;

public class PDFReportGenerator extends ReportGenerator {

    @Override
    protected void formatHeader() {
        System.out.println("PDF Report Header");
    }

    @Override
    protected void formatBody() {
        System.out.println("PDF Report Body with content.");
    }

    @Override
    protected void formatFooter() {
        System.out.println("PDF Report Footer");
    }
}

