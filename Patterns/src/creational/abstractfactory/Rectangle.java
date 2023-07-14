package creational.abstractfactory;

public class Rectangle implements IShape{
    @Override
    public void drawShape() {
        System.out.println("Rectangle is drawing...");
    }
}
