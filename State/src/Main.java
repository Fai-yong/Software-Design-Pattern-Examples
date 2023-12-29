public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.getState();
        context.Open();
        context.Close();
        context.Move();
        context.Stop();
        context.Open();
        context.Close();
        context.Move();
        context.Stop();
        context.Move();
        context.Stop();
        context.Open();
    }
}