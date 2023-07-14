package creational.abstractfactory;

public class Circle implements IShape{
    @Override
    public void drawShape() {
        System.out.println("Circle is drawing...");
    }
}
