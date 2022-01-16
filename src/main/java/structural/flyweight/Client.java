package structural.flyweight;

public class Client {
    public static void main(String[] args) {
        //prod1
        Laptop product1 = ProductRepository.getProd("Asus");
        System.out.println(product1);
        product1.setAvailability(true).setPrice(400);
        product1.printDetails();

        //prod2
        Laptop product2 = ProductRepository.getProd("HP");
        System.out.println(product2);
        product2.setAvailability(false).setPrice(600);
        product2.printDetails();

        //prod3
        Laptop product3 = ProductRepository.getProd("Lenovo");
        System.out.println(product3);
        product3.setAvailability(true).setPrice(800);
        product3.printDetails();

        //prod4
        Laptop product4 = ProductRepository.getProd("Dell");
        System.out.println(product4);
        product4.setAvailability(true).setPrice(800);
        product4.printDetails();

        //prod5
        Laptop product5 = ProductRepository.getProd("HP");
        System.out.println(product5);
        product5.setAvailability(true).setPrice(1000);
        product5.printDetails();
    }
}
