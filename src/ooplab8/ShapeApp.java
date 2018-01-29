package ooplab8;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("Whidth: "+rectangle.getWidth());
        System.out.println("Length: "+rectangle.getLength());
        System.out.println("Area: "+rectangle.getArea());


        Triangle triangle = new Triangle(20,0,30);
        System.out.println(triangle.getArea());
    }
}//ShapeApp