package creational.prototype;

public abstract class Headphones implements Cloneable{
    private String type;
    private String color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

}
