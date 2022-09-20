public class Cercle extends Figura {
    double r;
    public Cercle(double r) {
        this.r = r;
    }

    public String name() {
        return "Cercle";
    }

    public double area() {
        double area = Math.PI * Math.pow(r,2);
        return area;
    }
}
