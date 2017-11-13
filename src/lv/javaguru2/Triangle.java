package lv.javaguru2;

public class Triangle extends Shape{
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateSquare() {
        double pp = (a + b + c) / 2.0;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }



}
