public class Close implements State {
    @Override
    public void show() {
        System.out.println("Now is Close");
    }

    @Override
    public void opening(Context context) {
        context.setState(new Open());
        System.out.println("Lifter openned");
    }

    @Override
    public void closing(Context context) {
        System.out.println("Already closed, don't cloas again");
    }

    @Override
    public void moving(Context context) {
        context.setState(new Move());
        System.out.println("Lifter moved");
    }

    @Override
    public void stopping(Context context) {
        System.out.println("Close is after stopped, don't stop again");
    }
}
