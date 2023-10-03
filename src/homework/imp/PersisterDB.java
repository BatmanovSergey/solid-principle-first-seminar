package homework.imp;

import homework.Human;
import homework.Persisteable;

public class PersisterDB implements Persisteable {
    private final User user;

    public PersisterDB(User user){
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Save user in DB: " + getName());
    }

    @Override
    public String getName() {
        return user.getName();
    }
}
