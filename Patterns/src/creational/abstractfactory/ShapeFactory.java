package creational.abstractfactory;

public class ShapeFactory extends AbstractFactory{
    @Override
    IShape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Ellipse")) {
            return new Ellipse();
        }
        return null;
    }

    @Override
    IShape fillColor(String color) {
        return null;
    }
}
