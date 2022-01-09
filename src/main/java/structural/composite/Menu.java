package structural.composite;

public class Menu extends Item{
    public Menu(String name, Boolean available, int price) {
        setName(name);
        setAvailable(available);
        setPrice(price);
    }

    public void add(Item item){
        getSubitems().add(item);
    }

    public void remove(Item item){
        getSubitems().remove(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(getPrice() != -1)
            sb.append(getName() + "," + getAvailable() + "," + getPrice() + "\n");
        else
            sb.append(getName() + "," + getAvailable() + "\n");
        for(Item item: getSubitems()){
            sb.append(item.toString());
        }
        return sb.toString();
    }
}
