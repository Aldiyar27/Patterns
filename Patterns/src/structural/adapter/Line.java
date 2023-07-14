package structural.adapter;

public class Line {
    public void draw(int x, int y, int z, int k){
        System.out.println("Line from point A(" +
                x + ";" + y + "), to point B(" + z + ";" + k + ")");
    }
}
