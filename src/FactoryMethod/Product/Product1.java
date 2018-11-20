package FactoryMethod.Product;

public class Product1 extends ProductRoot {

    public Product1 plastic() {
        System.out.println("Plastic!");
        return new Product1();
    }

}
