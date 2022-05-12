package poo.rectangle;

public class Rectangle {
    public int a;
    public int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * This method calculates the area of a rectangle
     *
     * @author Quentin
     *
     * @return (int) Return the surface of the rectangle
     */
    public int surface(){
        return a*b;
    }
}
