package structural.Composite;

public class Menu extends Item{
    public Menu(String name, Boolean available, int price) {
        this.name = name;
        this.available = available;
        this.price = price;
    }

    public void add(Item item){
        this.subitems.add(item);
    }

    public void remove(Item item){
        this.subitems.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(price != -1)
            sb.append(name + "," + available + "," + price + "\n");
        for(Item item: this.subitems){
            sb.append(name + " -> " + item.toString() + "\n");
        }
        return sb.toString();
    }
}
