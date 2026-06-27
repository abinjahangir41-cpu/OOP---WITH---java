class Student {
    private String name;
    private int id;
    private double cgpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Abid ");
        student.setId(253002);
        student.setCgpa(3.85);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student CGPA: " + student.getCgpa());
    }
}