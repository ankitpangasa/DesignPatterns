package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class HeadphoneCatalog {

    private Map<String, Headphones> products = new HashMap<>();

    public HeadphoneCatalog() {
        loadHeadphones();
    }

    public Headphones createHeadphone(String type){
        Headphones headphones = null;
        try{
            headphones = (Headphones) products.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return headphones;
    }

    private void loadHeadphones(){
        Wired wired = new Wired();
        wired.setPortType("USB-C");
        wired.setColor("Black");
        wired.setPrice(3000);
        wired.setType("over-ear");
        products.put("Wired", wired);

        Wireless wireless = new Wireless();
        wireless.setTrueWirelss(false);
        wireless.setPrice(5000);
        wireless.setColor("Blue");
        wireless.setType("in-ear");
        products.put("Wireless", wireless);
    }
}
