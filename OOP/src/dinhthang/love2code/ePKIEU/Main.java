package dinhthang.love2code.ePKIEU;

public class Main {
    public static void main(String[] args) {
        Animal a=new Dog();
        Dog d= (Dog)a;

        d.makeNoise();
        d.fetch();

    }
}
