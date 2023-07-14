package structural.adapter;

public class LineAdapter implements Shape{
    private Line adaptee;

    public LineAdapter(Line adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
    }
}
