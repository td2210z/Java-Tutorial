package dinhthang.love2code.Interface;

public class Student {

    private String name , ns;

    private double gpa;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNs() {
        return ns;
    }



    public void setNs(String ns) {
        this.ns = ns;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, String ns , double gpa) {
        this.name = name;
        this.ns = ns;
        this.gpa = gpa;
    }




    @Override
    public String toString() {
        return name + " " + ns + " " + gpa;

    }
}
