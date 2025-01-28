package Ejercicio4;

public class Juguete extends Bienes implements Imponible{
    public int edadMinima;

    public Juguete(String descripcion, double precio, int edadMinima) {
        super(descripcion, precio);
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "edadMinima=" + edadMinima +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
