class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Doctor extends Person {
    public Doctor(String name) {
        super(name);
    }

    public void performSurgery() {
        displayInfo();
        System.out.println("Profession: Doctor");
        System.out.println("Work: Performs surgeries and saves lives.");
    }
}

class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    public void conductLecture() {
        displayInfo();
        System.out.println("Profession: Teacher");
        System.out.println("Work: Conducts lectures and grades assignments.");
    }
}

class Engineer extends Person {
    public Engineer(String name) {
        super(name);
    }

    public void designBridge() {
        displayInfo();
        System.out.println("Profession: Engineer");
        System.out.println("Work: Designs bridges and infrastructure.");
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor("Rahim");
        Teacher teach = new Teacher("Karim");
        Engineer eng = new Engineer("Abid");

        doc.performSurgery();
        System.out.println();
        teach.conductLecture();
        System.out.println();
        eng.designBridge();
    }
}