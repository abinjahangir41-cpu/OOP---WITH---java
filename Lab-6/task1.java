class Grandfather {
    public void company() {
        System.out.println("Grandfather's Tech Company");
    }
}

class Father extends Grandfather {
    public void car() {
        System.out.println("Father's rolls roys");
    }
}

class Son extends Father {
    public void gamingConsole() {
        System.out.println("Son's bike");
    }

    public static void main(String[] args) {
        Son sonObject = new Son();
        sonObject.company();
        sonObject.car();
        sonObject.gamingConsole();
    }
}