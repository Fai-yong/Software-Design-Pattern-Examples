public class Fund {
    private A a;
    private B b;
    private C c;

    public Fund() {
        this.a = new A();
        this.b = new B();
        this.c = new C();
    }

    public void purchase() {
        a.purchased();
        b.purchased();
        c.purchased();
    }
}
