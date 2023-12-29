public class Open implements State{
    @Override
    public void show() {
        System.out.println("Now is Open");
    }

    @Override
    public void opening(Context context) {
        System.out.println("Already open, don't open again");
    }

    @Override
    public void closing(Context context) {
        context.setState(new Close());
        System.out.println("lifter closed");
    }

    @Override
    public void moving(Context context) {
        System.out.println("Can not move without closing");
    }

    @Override
    public void stopping(Context context) {
        System.out.println("Open is after stopped, dont stop again");
    }
}
