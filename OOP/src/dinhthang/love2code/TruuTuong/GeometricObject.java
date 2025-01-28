package dinhthang.love2code.TruuTuong;

public abstract  class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;


    protected GeometricObject() {}


    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    public abstract double getArea();
    public abstract double getPerimeter();


}
