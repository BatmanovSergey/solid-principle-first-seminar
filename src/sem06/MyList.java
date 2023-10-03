package sem06;

import java.util.ArrayList;
import java.util.List;

public abstract class MyList <T> implements List <T> {
//    private ArrayList <String> list = new ArrayList<>(); //  так делать не нужно,
////    инициализировать надо в конструкторе

    private List <T> list;

    public MyList(List<T> list) {
        this.list = list;
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }
}
