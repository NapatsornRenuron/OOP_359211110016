package ooplab8;

public class Rectangle extends Shape{
    public Rectangle(int width, int length) {
        super(width, length);
    }

    @Override
    public double getArea() {
        return super.getWidth()*super.getLength();
    }
}