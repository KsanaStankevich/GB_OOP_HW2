import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5,10,3);
        double per = triangle.perimeter();
        double sq = triangle.area();
        System.out.println(per);
        System.out.println(sq);
        System.out.println();


        Square square = new Square(10);
        double perimeterSquare = square.perimeter();
        double areaSquare = square.area();

        System.out.println(perimeterSquare);
        System.out.println(areaSquare);
        System.out.println();

        Rectangle rectangle = new Rectangle(5,9);
        double perimeterRectangle = rectangle.perimeter();
        double areaRectangle = rectangle.area();

        System.out.println(perimeterRectangle);
        System.out.println(areaRectangle);
        System.out.println();

        Circle circle = new Circle(5);
        double perimeterCircle = circle.perimeter();
        double areaCircle = circle.area();

        System.out.println(perimeterCircle);
        System.out.println(areaCircle);
        System.out.println();

        //Figure [] figures = new Figure [10];
        List<Figure> figureList = new ArrayList<Figure>();
        figureList.add(triangle);
        figureList.add(square);
        figureList.add(rectangle);
        figureList.add(circle);
        for (int i = 0; i < figureList.size(); i++) {
            System.out.println(figureList.get(i));
        }

    }
}