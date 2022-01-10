package structural.decorator;

public class TextBoxDecorator extends ControlDecorator{
    public TextBoxDecorator(Control decoratedControl) {
        super(decoratedControl);
    }

    public void render(){
        super.render();
        defaultText();
    }

    public void defaultText(){
        System.out.println(" Default Text: Enter text here...");
    }
}
