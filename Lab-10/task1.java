public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle(5.5);

        System.out.println("Circle Radius: " + myCircle.getRadius());
        System.out.println("Circle Area: " + myCircle.calculateArea());
        System.out.println("Circle Circumference: " + myCircle.calculateCircumference());
    }
}