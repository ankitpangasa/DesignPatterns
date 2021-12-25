package creational.prototype;

public class HeadphonePrototype {
    public static void main(String[] args) {
        HeadphoneCatalog headphoneCatalog = new HeadphoneCatalog();
        Wireless wireless1 = (Wireless) headphoneCatalog.createHeadphone("Wireless");
        Wireless wireless2 = (Wireless) headphoneCatalog.createHeadphone("Wireless");
        wireless2.setPrice(4000);

        System.out.println(wireless1.getPrice());
        System.out.println(wireless1.getColor());
        System.out.println(wireless2.getPrice());
        System.out.println(wireless2.getColor());

        Wired wired = (Wired) headphoneCatalog.createHeadphone("Wired");
        wired.setType("over-ear");
        System.out.println(wired.getType());
    }
}
