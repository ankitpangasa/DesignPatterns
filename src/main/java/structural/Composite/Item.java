package structural.Composite;

import java.util.List;

public abstract class Item {
    String name;
    Boolean available;
    int price;
    List<Item> subitems;
    public abstract String toString();
}
