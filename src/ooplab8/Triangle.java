package ooplab8;
public class Triangle extends Shape {
    private int high;

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public Triangle(int width, int length, int high) {
        super(width, length);
        this.high=high;
    }

    @Override
    public double getArea() {
        return super.getWidth()*high*0.5;
    }
}
