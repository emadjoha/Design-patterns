package Adapter;

public class Client {
    Target target = new Adapter();

    public void F() {
        int a = 0, b = 1;
        target.req(a, b);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.F();
    }
}
