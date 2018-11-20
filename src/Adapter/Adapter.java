package Adapter;

public class Adapter extends Target {

    Adptee adptee = new Adptee();

    @Override
    public void req(int a, int b) {
        System.out.println("Req From Adapter");
        adptee.req(a, b, 2);
    }
}
