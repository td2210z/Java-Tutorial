package dinhthang.love2code.TruuTuong;

public class Main {


    public static boolean equalArea(GeometricObject o1, GeometricObject o2){
        return o1.getArea() == o2.getArea();
    }


    public static void display(GeometricObject o){
        System.out.println(o.getArea() + " " + o.getPerimeter());
    }


    public static void main(String[] args) {
        GeometricObject ob1 = new Circle("Red", true, 10);
        GeometricObject ob2 = new Rectangle(10, 20, "Green", true);
        System.out.println(equalArea(ob1, ob2));
        display(ob1); display(ob2);
    }
}
