package structural.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Item {
    public String getName() {
        return name;
    }

    public Boolean getAvailable() {
        return available;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String name;
    private Boolean available;
    private int price;

    public void setSubitems(List<Item> subitems) {
        this.subitems = subitems;
    }

    public List<Item> getSubitems() {
        return subitems;
    }

    private List<Item> subitems = new ArrayList<>();
    public abstract String toString();
}
