package PackComposition;

public class Client {

    public static void main(String args[]){

        Leaf leaf  = new Leaf("A");
        Leaf leaf1 = new Leaf("B");
        Composite composite = new Composite();
        composite.add(leaf);
        composite.add(leaf1);

        Leaf leaf2 = new Leaf("C");
        Leaf leaf3 = new Leaf("D");
        Composite composite2 = new Composite();
        composite2.add(leaf2);
        composite2.add(leaf3);


        Composite compositeFinal = new Composite();
        compositeFinal.add(composite);
        compositeFinal.add(composite2);
        compositeFinal.show();

    }
}
