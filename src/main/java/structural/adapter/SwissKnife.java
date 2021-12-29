package structural.adapter;

public class SwissKnife implements InterfaceSwissKnife{
    @Override
    public boolean isDirty() {
        return false;
    }

    @Override
    public void cut() {
        System.out.println("pieces cut using large blade");
    }

    @Override
    public void openCan() {
        System.out.println("can opened using can opener");
    }

    @Override
    public void punchHole() {
        System.out.println("punched hole");
    }

    @Override
    public boolean isSharp() {
        return false;
    }
}
