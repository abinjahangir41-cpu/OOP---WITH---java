public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sumTwoInt = calc.add(10, 20);
        System.out.println("adding two integer no : " + sumTwoInt);

        double sumTwoDouble = calc.add(5.5, 4.3);
        System.out.println("adding three integer no : " + sumTwoDouble);

        int sumThreeInt = calc.add(5, 15, 25);
        System.out.println("adding no: " + sumThreeInt);
    }
}