package Facade;

public class Facade {

    public A a = new A();
    public B b = new B();
    public C c = new C();


    public void F() {
        a.Fa();   // First
        b.Fb();   // Second
        c.Fc();   // Third
    }
}
