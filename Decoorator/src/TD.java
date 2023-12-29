import taste.*;
public class TD extends Decorator {
    public TD(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void show() {
        System.out.print("糖豆【");
        iceCream.show();
        System.out.print("】");
    }
}
