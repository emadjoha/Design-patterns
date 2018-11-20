package FactoryMethod.Product;

public class Product2 extends ProductRoot {

    public Product2 wood() {
        System.out.println("wood");
        return new Product2();
    }
}
