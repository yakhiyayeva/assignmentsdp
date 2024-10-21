package template;

public class PlainTextReportGenerator extends ReportGenerator {

    @Override
    protected void formatHeader() {
        System.out.println("Plain Text Report Header");
    }

    @Override
    protected void formatBody() {
        System.out.println("Plain Text Report Body with content.");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Plain Text Report Footer");
    }
}