package lv.javaguru2;

public class Circle extends Shape{
    int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSquare() {
        double area = Math.PI * (radius * radius);
        /**System.out.println("Площадь круга равна: " + area);**/
        return area;
    }
}
