package structural.flyweight;

public class Laptop implements Product{
    String name;
    int price;
    Boolean availability;

    public Laptop(String name) {
        this.name = name;
    }

    public Laptop(String name, int price, Boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public Laptop setPrice(int price) {
        this.price = price;
        return this;
    }

    public Laptop setAvailability(Boolean availability) {
        this.availability = availability;
        return this;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean getAvailability() {
        return availability;
    }

    public void printDetails(){
        System.out.println("Item name :" + name + ", Price : $" + getPrice() + ", Availability : " + getAvailability());
    }
}
