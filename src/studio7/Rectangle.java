package studio7;

public class Rectangle {


    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return this.length * this.width;
    }

    public double perimeter() {
        return 2 * (this.length + this.width);
    }

    public boolean isSquare() {
        return this.length == this.width;
    }

    //test run
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 10.0);
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
        System.out.println("Is Square: " + rect.isSquare());
    }   
}

