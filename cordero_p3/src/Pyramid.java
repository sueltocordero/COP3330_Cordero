public class Pyramid extends Shape3D {
    private double l;
    private double w;
    private double h;
    public Pyramid(double length, double width, double height) {
        super();
        this.l = length;
        this.w = width;
        this.h = height;
    }

    @Override
    public double getVolume() {
        return (l*w*h)/3;
    }

    @Override
    public String getName() {
        return "pyramid";
    }

    @Override
    public double getArea() {
        double area = (l * w) + (l * Math.sqrt((0.5*w*0.5*w)+(h*h))) + w*Math.sqrt((0.5*l*0.5*l)+(h*h));
        return area;
    }
}
