package homework.imp;

import homework.Reporteable;

public class Report implements Reporteable {
    private final User user;

    public Report(User user) {
        this.user = user;
    }

    @Override
    public void report() {
        System.out.println(
                "Report for user: " + getName());
    }

    @Override
    public String getName() {
        return user.getName();
    }
}
