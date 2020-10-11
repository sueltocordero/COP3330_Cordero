public class Square extends Shape2D {
    private double side;
    public Square(double i) {
        super();
        this.side = i;
    }

    @Override
    public String getName() {

        return "square";
    }

    @Override
    public double getArea() {
        return side*side;
    }


}
