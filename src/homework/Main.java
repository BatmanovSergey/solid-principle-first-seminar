package homework;

import homework.imp.PersisterDB;
import homework.imp.PersisterFile;
import homework.imp.Report;
import homework.imp.User;

public class Main {
    public static void main(String[] args) {
        Human user = new User("Bob");
        PersisterFile percol = new PersisterFile((User) user);
        percol.save();
        PersisterDB perDB = new PersisterDB((User) user);
        perDB.save();
        Report report = new Report((User) user);
        report.report();
        user.getName();
    }
}