package chainOfResponseablity;

public class H1 extends Handler {
    Handler handlerSucess = new H2();
    @Override
    public void handlerRequest() {
        System.out.println("Hello From H1");
        if(false){

            System.out.println("Done!");
        }
        else{
            handlerSucess.handlerRequest();
        }

    }
}
