package structural.decorator;

public class Button implements Control{
    @Override
    public void render() {
        System.out.print("Render Button.");
    }
}
