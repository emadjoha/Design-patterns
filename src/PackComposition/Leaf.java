package PackComposition;

public class Leaf implements Component {

    public String nameLeaf;
    public Leaf(String nameLeaf){ this.nameLeaf = nameLeaf;}

    @Override
    public void show() {
        System.out.println("my Leaf is : "+this.nameLeaf);
    }

}
