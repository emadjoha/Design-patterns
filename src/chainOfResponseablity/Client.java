package chainOfResponseablity;

public class Client {
    public Handler handler = new Handler();

    public void printHandler() {
        handler.handlerRequest();
    }


    public static void main(String[] args) {
        Client client = new Client();
        client.printHandler();
    }
}
