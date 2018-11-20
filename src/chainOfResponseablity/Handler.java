package chainOfResponseablity;

public class Handler {
    public Handler handlersucess;

    public void handlerRequest() {
        System.out.println("Handler");
        handlersucess = new H1();
        handlersucess.handlerRequest();
    }
}
