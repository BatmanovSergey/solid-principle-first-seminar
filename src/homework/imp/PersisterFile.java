package homework.imp;

import homework.Persisteable;

public class PersisterFile implements Persisteable {
    private final User user;

    public PersisterFile(User user){
        this.user = user;
    }

    @Override
    public void save() {
        System.out.println("Save user in file: " + getName());
    }

    @Override
    public String getName() {
        return user.getName();
    }
}
