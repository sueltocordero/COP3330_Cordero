public class Cube extends Shape3D {
    private double side;
    public Cube(double side) {
        super();
        this.side = side;
    }

    @Override
    public double getVolume() {
        return side*side*side;
    }

    @Override
    public double getArea() {
        return 6*side*side;
    }

    @Override
    public String getName() {
        return "cube";
    }
}
