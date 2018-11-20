package Composition;

public class A {

    public A() {
        B b = new B();

    }

    public static void main(String args[]) {
        A a = new A();

        System.out.println("Main");
    }
}
