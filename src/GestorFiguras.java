import java.util.Arrays;

public class GestorFiguras {
    public static double suma(Figura[] vectorFiguras) {
        double suma = 0;
        int i = 0;
        while (i < vectorFiguras.length)
        {
            suma = suma + vectorFiguras[i].area();
            i++;
        }
        return suma;
    }

    public static void main(String[] args) {
        Figura[] v = new Figura[5];
        v[0] = new Cercle(4);
        v[1] = new Quadrat(2);
        v[2] = new Triangle(3, 5);
        v[3] = new Rectangle(2, 5);
        v[4] = new Quadrat(6);
        double suma = suma(v);
        System.out.printf("La suma total de les àrees és de " + suma + ".\n");
        Arrays.sort(v);
        for(Figura figura : v) {
            System.out.println(figura.name() + " té una àrea de " + figura.area() + ".");
        }
    }
}
