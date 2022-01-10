package structural.decorator;

public class ButtonDecorator extends ControlDecorator{
    public ButtonDecorator(Control decoratedControl) {
        super(decoratedControl);
    }

    public void render(){
        super.render();
        setText();
    }

    public void setText(){
        System.out.println(" Text: Click");
    }
}
