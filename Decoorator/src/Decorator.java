import taste.*;

public class Decorator implements IceCream {
    IceCream iceCream;

    public Decorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public void show() {
        iceCream.show();

    }
}
