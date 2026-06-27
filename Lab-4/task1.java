public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "mazdaa", 2024);
        myCar.displayDetails();
    }
}