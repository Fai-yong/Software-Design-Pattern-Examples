public class Move implements State {
    @Override
    public void show() {
        System.out.println("Now is Move");
    }

    @Override
    public void opening(Context context) {
        System.out.println("Can not open when moving");
    }

    @Override
    public void closing(Context context) {
        System.out.println("Move is after closed, don't close again");
    }

    @Override
    public void moving(Context context) {
        System.out.println("Already moving, don't moving again");
    }

    @Override
    public void stopping(Context context) {
        context.setState(new Stop());
        System.out.println("Lifter stopped");
    }
}
