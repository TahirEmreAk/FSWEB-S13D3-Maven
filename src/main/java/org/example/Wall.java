package org.example;

public class Wall {
    private double width;
    private double height;

    // Constructor
    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // Getter metotları
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setter metotları (negatif değerler için kontrol içerir)
    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    // Alan hesaplama metodu
    public double getArea() {
        return width * height;
    }
}
