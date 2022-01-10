package structural.decorator;

public class ControlDecorator implements Control{

    protected Control decoratedControl;

    public ControlDecorator(Control decoratedControl) {
        this.decoratedControl = decoratedControl;
    }

    @Override
    public void render() {
        decoratedControl.render();
    }
}
