package structural.adapter;

public class ClientKnife {
    public static void main(String[] args) {
        //traditional knife
        System.out.print("traditional knife :: ");
        InterfaceKnife knife = new Knife();
        knife.cut();

        //swiss knife
        System.out.print("swiss knife :: ");
        SwissKnife swissKnife = new SwissKnife();
        swissKnife.cut();

        //swissKnife delivering an object of knife using adapter pattern
        System.out.print("swiss knife adapted as traditional knife :: ");
        InterfaceKnife swissAsKnife = new KnifeAdapter(new SwissKnife());
        swissAsKnife.cut();
    }
}
