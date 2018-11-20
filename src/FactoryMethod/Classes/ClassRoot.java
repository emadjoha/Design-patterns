package FactoryMethod.Classes;

import FactoryMethod.Product.ProductRoot;

public class ClassRoot {
    ProductRoot productRoot;

    public ProductRoot MakeObject() {
        return productRoot;
    }

}
