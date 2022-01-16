package structural.flyweight;

import java.util.HashMap;

public class ProductRepository {
    private static final HashMap prod = new HashMap();

    public static Laptop getProd(String name){
        if(prod.containsKey(name))
            return (Laptop) prod.get(name);
        else {
            Product laptop = new Laptop(name);
            prod.put(name, laptop);
            return (Laptop) laptop;
        }
    }
}
