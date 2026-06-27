public class Shape {

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        double rectangleArea = shape.calculateArea(5.0, 10.0);
        System.out.println("Rectangle-: " + rectangleArea);

        double circleArea = shape.calculateArea(7.0);
        System.out.println("Circle-: " + circleArea);
    }
}