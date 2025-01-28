package dinhthang.love2code.KeThua;

public class People {

    private String name;
    private int age;
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}


