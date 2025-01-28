package dinhthang.love2code.TruuTuong;

import java.awt.*;

public class Rectangle extends GeometricObject {


    private double width , height;

    public Rectangle(double width, double height , String color , boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;

    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
