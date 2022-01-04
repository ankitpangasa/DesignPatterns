package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Item book = new Book("Self-Esteem", "Ikigai", "Héctor García", 300);
        Formatter htmlformatter = new HTMLFormatter();
        System.out.println("HTML Formatter");
        System.out.println(htmlformatter.print(book));
        Formatter textFormatter = new TextFormatter();
        System.out.println("***************************************************");
        System.out.println("Text Formatter");
        System.out.println(textFormatter.print(book));
    }
}
