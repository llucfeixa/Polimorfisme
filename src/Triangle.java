public class Triangle extends Figura {
    double b;
    double h;
    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public String name() {
        return "Triangle";
    }

    public double area() {
        double area = (b * h) / 2;
        return area;
    }
}
