public class Square extends Figure{
    int side;

    public Square(int side){
        this.side = side;
    }



    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public double area() {
        return side*side;
    }
}