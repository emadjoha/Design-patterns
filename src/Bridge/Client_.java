package Bridge;

import Bridge.Abstraction.ChildClassOne;
import Bridge.Abstraction.ParentClass;

public class Client_ {

    public static void main(String[] args) {
        ParentClass childClassOne = new ChildClassOne();
        childClassOne.fun();

    }
}
