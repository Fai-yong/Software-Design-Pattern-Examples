public class Stop implements State{
    @Override
    public void show() {
        System.out.println("Now is Stop");
    }

    @Override
    public void opening(Context context) {
        context.setState(new Open());
        System.out.println("Lifter openned");
    }

    @Override
    public void closing(Context context) {
        System.out.println("Stop is after closed");
    }

    @Override
    public void moving(Context context) {
        context.setState(new Move());
        System.out.println("Start moving again");
    }

    @Override
    public void stopping(Context context) {
        System.out.println("Already stopped, don't stop again");
    }
}
