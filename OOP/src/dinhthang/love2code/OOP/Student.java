package dinhthang.love2code.OOP;

public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
        System.out.println("Student Constructor");
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, " + name + "!");
    }
    @Override
    public String toString() {
        return "Student [name=" + this.name + ", age=" + this.age + "]";
    }
}
