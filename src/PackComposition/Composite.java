package PackComposition;

import java.util.ArrayList;

public class Composite implements Component {

    ArrayList<Component> arraycomponent = new ArrayList<Component>();

    @Override
    public void show() {
        for (Component comp : arraycomponent) {
            comp.show();
        }


    }

    public void add(Component component) {
        arraycomponent.add(component);
    }

    public void remove(Component component) {
        arraycomponent.remove(component);
    }


}
