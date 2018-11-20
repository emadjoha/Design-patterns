package FactoryMethod;

import FactoryMethod.Classes.Class1;
import FactoryMethod.Classes.Class2;
import FactoryMethod.Classes.ClassRoot;

public class Client {

    public static void main(String[] args) {
        ClassRoot classRoot = new Class1();
        classRoot.MakeObject();
        ClassRoot classRoot1 = new Class2();
        classRoot1.MakeObject();
    }

}

