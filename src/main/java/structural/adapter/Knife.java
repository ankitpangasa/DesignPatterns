package structural.adapter;

public class Knife implements InterfaceKnife{

    @Override
    public boolean isDirty() {
        return false;
    }

    @Override
    public void cut() {
        System.out.println("pieces cut using knife");
    }

    @Override
    public boolean isSharp() {
        return false;
    }
}
