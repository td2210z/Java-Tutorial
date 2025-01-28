package dinhthang.love2code.KeThua;

public class Person extends People{
    private String lop;
    private double gpa;
    
    public Person(String name, int age, String lop, double gpa) {
        super(name, age);
        this.lop = lop;
        this.gpa = gpa;
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nLop: " + lop + "\nGPA: " + gpa;
    }
}
