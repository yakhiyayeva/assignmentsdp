package template;

// Abstract class defining the template method
public abstract class ReportGenerator {

    // Template method: final to prevent overriding
    public final void generateReport() {
        formatHeader();
        formatBody();
        formatFooter();
        System.out.println("Report generated successfully.\n");
    }

    // Abstract methods for steps that vary between report types
    protected abstract void formatHeader();
    protected abstract void formatBody();
    protected abstract void formatFooter();
}

