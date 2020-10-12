public class Sphere extends Shape3D {
    private double r;
    public Sphere(double radius) {
        super();
        this.r = radius;
    }

    @Override
    public double getVolume() {
        return (1.333333333)*3.141592653589793*r*r*r;
    }

    @Override
    public String getName() {
        return "sphere";
    }

    @Override
    public double getArea() {
        return 4*3.141592653589793*r*r;
    }
}
