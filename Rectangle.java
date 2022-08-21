public class Rectangle extends Figure{
    int firstSide;
    int secondSide;

    public Rectangle(int firstSide, int secondSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;

    }
    @Override
    public double perimeter() {
        return (firstSide + secondSide) * 2;
    }

    @Override
    public double area() {

        return firstSide * secondSide;
    }
}