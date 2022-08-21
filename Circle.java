public class Circle extends Figure{
    int radius;

    public Circle(int radius){

        this.radius = radius;
    }

    @Override
    public double perimeter() {

        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {

        return Math.PI * radius * radius;
    }
}