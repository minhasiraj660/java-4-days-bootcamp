package Day2;

public abstract class Shape {

    abstract double calculateArea();

    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(8, 6);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}