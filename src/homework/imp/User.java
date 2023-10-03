package homework.imp;

import homework.Human;

public class User implements Human {
    private final String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}