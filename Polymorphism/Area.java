// Base class
class Shape {
    public void calculateArea() {
        System.out.println("Area not defined");
    }
}

// Subclass Circle
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    @Override
    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Subclass Triangle
class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    public void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Main class
public class Area {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5);
        s.calculateArea();

        s = new Rectangle(4, 6);
        s.calculateArea();

        s = new Triangle(3, 7);
        s.calculateArea();
    }
}