import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner vl = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura:");
        String nombre = vl.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = vl.nextLine();

        System.out.println("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo):");
        int tipoFigura = vl.nextInt();

        switch (tipoFigura) {
            case 1:
                System.out.println("Ingrese el radio del círculo:");
                double radio = vl.nextDouble();
                Circulo circulo = new Circulo(nombre, color, radio);
                System.out.println("Área del círculo: " + circulo.obtenerArea());
                System.out.println("Perímetro del círculo: " + circulo.obtenerPerimetro());
                break;

            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                double lado1 = vl.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                double lado2 = vl.nextDouble();
                Rectangulo rectangulo = new Rectangulo(nombre, color, lado1, lado2);
                System.out.println("Área del rectángulo: " + rectangulo.obtenerArea());
                System.out.println("Perímetro del rectángulo: " + rectangulo.obtenerPerimetro());
                break;

            case 3:
                System.out.println("Ingrese el valor de la base del triángulo:");
                double base = vl.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                double altura = vl.nextDouble();
                Triangulo triangulo = new Triangulo(nombre, color, base, altura);
                System.out.println("Área del triángulo: " + triangulo.obtenerArea());
                System.out.println("Perímetro del triángulo: " + triangulo.obtenerPerimetro());
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}


