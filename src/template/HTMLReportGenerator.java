package template;

public class HTMLReportGenerator extends ReportGenerator {

    @Override
    protected void formatHeader() {
        System.out.println("<html><head><title>HTML Report</title></head>");
        System.out.println("<body><h1>HTML Report Header</h1>");
    }

    @Override
    protected void formatBody() {
        System.out.println("<p>HTML Report Body with content.</p>");
    }

    @Override
    protected void formatFooter() {
        System.out.println("<footer>HTML Report Footer</footer>");
        System.out.println("</body></html>");
    }
}
