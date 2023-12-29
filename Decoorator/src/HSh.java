import taste.*;
public class HSh extends Decorator {
    public HSh(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void show() {
        System.out.print("花生【");
        iceCream.show();
        System.out.print("】");
    }
}
