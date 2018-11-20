package Singleton;

public class Singleton {
    public String name;

    private Singleton() {
    }

    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    public void Make(String name) {
        ourInstance.name = name;
        System.out.println(ourInstance.name);
    }
}
