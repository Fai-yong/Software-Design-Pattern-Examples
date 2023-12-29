public interface State {
    public void show();
    public void opening(Context context);
    public void closing(Context context);
    public void moving(Context context);
    public void stopping(Context context);
}
