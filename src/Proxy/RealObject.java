package Proxy;

public class RealObject extends Object {

    public String name;

    public RealObject(String name) {
        this.name = name;
    }

    @Override
    public void func() {
        System.out.println("Real Object is Here!");
    }
}
