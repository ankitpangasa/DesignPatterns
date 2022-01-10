package structural.decorator;

public class TextBox implements Control{

    @Override
    public void render() {
        System.out.print("Render Textbox.");
    }
}
