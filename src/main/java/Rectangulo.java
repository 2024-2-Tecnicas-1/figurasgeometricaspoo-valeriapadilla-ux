public class Rectangulo {
    private String nombre;
    private String color;
    private double lado1;
    private double lado2;

    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        this.nombre = nombre;
        this.color = color;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double obtenerArea() {
        return lado1 * lado2;
    }

    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }
}


