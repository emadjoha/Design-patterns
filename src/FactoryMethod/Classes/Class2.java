package FactoryMethod.Classes;

import FactoryMethod.Product.Product1;
import FactoryMethod.Product.ProductRoot;

public class Class2 extends ClassRoot {
    @Override
    public ProductRoot MakeObject() {
        System.out.println("Make Object Class2");
        ProductRoot product1 = new Product1();
        return ((Product1) product1).plastic();
    }
}
