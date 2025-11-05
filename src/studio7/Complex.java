package studio7;

public class Complex {
private double real;
    private double imaginary;

 
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    public String toString() {
        if (imaginary >= 0) {
            return String.format("(%.2f + %.2fi)", real, imaginary);
        } else {
            return String.format("(%.2f - %.2fi)", real, Math.abs(imaginary));
        }
    }

    //test run
    public static void main(String[] args) {
        Complex c1 = new Complex(3.0, 4.0);
        Complex c2 = new Complex(1.5, -2.0);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        Complex sum = c1.add(c2);
        Complex product = c1.multiply(c2);

        System.out.println("c1 + c2 = " + sum);
        System.out.println("c1 * c2 = " + product);
    }
}

