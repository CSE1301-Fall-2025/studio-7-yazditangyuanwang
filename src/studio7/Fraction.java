package studio7;

public class Fraction {

 private int numerator;
 private int denominator;

public Fraction(int numerator, int denominator){
            this.numerator=numerator;
            this.denominator=denominator;
    }

public int getNumerator(){
            return this.numerator;
}
public int getDenominator(){
            return this.denominator;
}
public String toString(){
            return this.numerator + "/" + this.denominator; 

}
public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

public Fraction reciprocal() {
        if (this.numerator == 0) {
            throw new ArithmeticException("Cannot take reciprocal of zero.");
        }
        return new Fraction(this.denominator, this.numerator);
    }

private void simplify() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        // keep denominator positive
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    //test run
public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        System.out.println("f1 + f2 = " + f1.add(f2));
        System.out.println("f1 * f2 = " + f1.multiply(f2));
        System.out.println("reciprocal of f1 = " + f1.reciprocal());
    }

}
