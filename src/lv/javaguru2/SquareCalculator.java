package lv.javaguru2;

import java.util.*;

public class SquareCalculator {
    public static void main(String[] args) {

        Random rand = new Random();

        ArrayList<Shape> figura = new ArrayList<Shape>();

        Shape a = new Circle(rand.nextInt(100));
        figura.add(a);
        Shape b = new Triangle(rand.nextInt(100), rand.nextInt(100), rand.nextInt(100));
        figura.add(b);
        Shape c = new Kvadrats(rand.nextInt(100));
        figura.add(c);

        double area1 = a.calculateSquare();
        double area2 = b.calculateSquare();
        double area3 = c.calculateSquare();
        double sum = area1 + area2 + area3;

        /**System.out.println("Площадь фигур списка равна:" + area1);**/
        System.out.println("Площадь фигур списка равна:" + sum);

    }
}
