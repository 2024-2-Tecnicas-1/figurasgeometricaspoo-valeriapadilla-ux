public class Circulo {
    private String nombre;
    private String color;
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        this.nombre = nombre;
        this.color = color;
        this.radio = radio;
    }

    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public double getRadio() {
        return radio;
    }
}


