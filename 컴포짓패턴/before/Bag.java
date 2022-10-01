package 컴포짓패턴.before;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Item> items;

    public Bag() {
        items = new ArrayList<>();
    }

    void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
