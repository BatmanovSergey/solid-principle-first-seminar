package dip1.model.util;

import dip1.model.ReportItem;
import dip1.model.Reportable;

import java.util.List;

public class ReportConsole implements Reportable {

    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Печатаем в консоль");
        System.out.println(items);

    }
}
