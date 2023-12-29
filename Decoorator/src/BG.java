import taste.*;
public class BG extends Decorator {
    public BG(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void show() {
        System.out.print("饼干【");
        iceCream.show();
        System.out.println("】");
    }
}
