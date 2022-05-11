package poo.rectangle;

public class Rectangle {
    public int a;
    public int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Return the surface of the rectangle
     * @return int
     */
    public int surface(){
        return a*b;
    }
}
