public class Triangle extends Shape2D {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        super();
        this.base =base;
        this.height = height;
    }

    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public double getArea() {
        double area = 0.5* base* height;
        return area;
    }
}
