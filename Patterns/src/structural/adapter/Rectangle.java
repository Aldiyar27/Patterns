package structural.adapter;

public class Rectangle {
    public void draw(int x, int y, int z, int k){
        System.out.println("Rectangle with coordinate left-down point (" +
                 x + ";" + y + "), width: " + z + ", height: " + k);
    }
}
