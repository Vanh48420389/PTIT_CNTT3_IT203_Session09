
abstract class Shape {
    public abstract double calculateArea();
    public abstract String getDescription();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getDescription() {
        return "Hình tròn (r=" + radius + ")";
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getDescription() {
        if (width == height) {
            return "Hình vuông (cạnh " + width + ")";
        }
        return "Hình chữ nhật (" + width + " x " + height + ")";
    }
}

public class Bai6 {
    public static void main(String[] args) {


        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(3.0, 4.0);
        shapes[2] = new Rectangle(6.0);


        double totalArea = 0;

        for (Shape s : shapes) {
            double area = s.calculateArea();

            System.out.println(s.getDescription() + " - Diện tích: " + area);

            totalArea += area;
        }

        System.out.println("=> Tổng diện tích: " + totalArea);
    }
}