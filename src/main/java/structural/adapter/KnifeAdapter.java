package structural.adapter;

public class KnifeAdapter implements InterfaceKnife{
    SwissKnife swissKnife;

    public KnifeAdapter(SwissKnife swissKnife) {
        this.swissKnife = swissKnife;
    }

    @Override
    public boolean isDirty() {
        return false;
    }

    @Override
    public void cut() {
        swissKnife.cut();
    }

    @Override
    public boolean isSharp() {
        return false;
    }
}
