public class Triangulo {
    private String nombre;
    private String color;
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        this.nombre = nombre;
        this.color = color;
        this.base = base;
        this.altura = altura;
    }

    public double obtenerArea() {
        return (base * altura) / 2;
    }

    public double obtenerPerimetro() {
        // Supongamos que el triángulo es equilátero
        return 3 * base;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}


