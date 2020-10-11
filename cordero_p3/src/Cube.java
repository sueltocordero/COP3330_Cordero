public class Cube extends Shape3D {
    private double side;
    public Cube(int side) {
        super();
        this.side = side;
    }

    @Override
    public double getVolume() {
        return 0;
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
