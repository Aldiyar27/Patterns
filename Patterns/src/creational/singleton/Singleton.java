package creational.singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void getDescription(){
        System.out.println("I'am a simple Singleton");
    }
}
