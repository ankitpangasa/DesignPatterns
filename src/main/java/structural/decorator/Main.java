package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Control textBox = new TextBoxDecorator(new ControlDecorator(new TextBox()));
        Control button = new ButtonDecorator(new ControlDecorator(new Button()));
        textBox.render();
        button.render();
    }
}
