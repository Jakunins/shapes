package lv.javaguru2;

public class Kvadrats extends Shape{
    int length;

    public Kvadrats(int length) {
        this.length = length;

    }

    @Override
    public double calculateSquare() {
        return length * length;
    }
}
