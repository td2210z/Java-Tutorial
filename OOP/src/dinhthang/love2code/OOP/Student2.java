package dinhthang.love2code.OOP;

public class Student2 {

    private String name , ns;
    private int age;
    private static int dem =0;


    public Student2(String name,  String ns, int age) {
        dem++;
        this.name = name;
        this.ns = ns;
        this.age = age;
    }

    public int getDem() {
        return dem;
    }
}
