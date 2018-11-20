package FactoryMethod.Classes;

import FactoryMethod.Product.Product2;
import FactoryMethod.Product.ProductRoot;

public class Class1 extends ClassRoot {

    @Override
    public ProductRoot MakeObject() {
        System.out.println("Make Object Class1");
        ProductRoot productRoot2 = new Product2();
        return ((Product2) productRoot2).wood();
    }
}
