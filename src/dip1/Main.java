package dip1;

import dip1.model.Report;
import dip1.model.ReportItem;
import dip1.model.ReportManager;
import dip1.model.util.ReportConsole;
import dip1.model.util.ReportPrinter;
import logger.Log;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
//        Report report = new Report();
//        report.calculate();
//        report.output();
        ReportManager rp = new ReportManager(new ReportConsole());
        List<ReportItem> items = new ArrayList<>();
        items.add(new ReportItem("FIRST", 1f));
        items.add(new ReportItem("SECOND", 5f));
        rp.output(items);
    }
}
