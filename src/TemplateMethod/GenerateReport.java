package TemplateMethod;

public class GenerateReport extends Task {

    public GenerateReport(AuditTrail auditTrail){
        super(auditTrail);
    }

    @Override
    public void doExecute() {
        System.out.println("Generating Report");
    }
}
