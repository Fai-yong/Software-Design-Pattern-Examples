import taste.*;
public class QKL extends Decorator {
    public QKL(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public void show() {
        System.out.print("巧克力【");
        iceCream.show();
        System.out.print("】");
    }
}
