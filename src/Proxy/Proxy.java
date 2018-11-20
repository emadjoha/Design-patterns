package Proxy;

public class Proxy extends Object {
    RealObject realObjec = new RealObject("A");

    @Override
    public void func() {

        if (realObjec.name == "A")
            realObjec.func();
        else {
            System.out.println("Not Found Real Object!");
        }
    }

}
