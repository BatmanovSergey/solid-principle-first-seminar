package dip1.model;

import dip1.model.util.ReportPrinter;

import java.util.List;

public class ReportManager {
    private Reportable report;
    public ReportManager(Reportable report) {
        this.report = report;
    }

    public void output(List<ReportItem> items) {
//        ReportPrinter reportPrint = new ReportPrinter();
        report.output(items);
    }
}
