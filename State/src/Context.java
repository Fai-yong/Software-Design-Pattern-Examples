public class Context {
    State state = new Open();

    public void setState(State state) {
        this.state = state;
    }

    public void getState() {
        state.show();
    }

    public void Open() {
        state.opening(this);
    }

    public void Close() {
        state.closing(this);
    }

    public void Stop() {
        state.stopping(this);
    }

    public void Move() {
        state.moving(this);
    }

}
