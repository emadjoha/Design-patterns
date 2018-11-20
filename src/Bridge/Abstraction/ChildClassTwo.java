package Bridge.Abstraction;

import Bridge.Realization.ImplementClass;

public class ChildClassTwo extends ParentClass{


    @Override
    public void fun() {
        implementClass.function();
    }
}
