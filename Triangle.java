public class Triangle extends Figure{
    int firstCathet;
    int secondCathet;
    int thirdCathet;

    public Triangle(int firstCathet, int secondCathet, int thirdCathet){
        try {
            if(firstCathet + secondCathet <= thirdCathet &&
                    secondCathet + thirdCathet <= firstCathet ||
                    firstCathet + thirdCathet <= secondCathet){
                throw new IllegalArgumentException("exception");
            }

        } catch (IllegalArgumentException e) {
            System.out.print("exception\n");
        }

        this.firstCathet = firstCathet;
        this.secondCathet = secondCathet;
        this.thirdCathet = thirdCathet;


    }

    @Override
    public double perimeter() {
        if(firstCathet + secondCathet <= thirdCathet &&
                secondCathet + thirdCathet <= firstCathet ||
                firstCathet + thirdCathet <= secondCathet){
            return -1;
        }
        else {
            return firstCathet + secondCathet + thirdCathet;
        }

    }



    @Override
    public double area() {
        if(firstCathet + secondCathet <= thirdCathet &&
                secondCathet + thirdCathet <= firstCathet ||
                firstCathet + thirdCathet <= secondCathet){
            return -1;
        }
        else {
            double p = perimeter() / 2;
            return Math.sqrt(p * (p - firstCathet) * (p - secondCathet) * (p - thirdCathet));
        }

    }
}