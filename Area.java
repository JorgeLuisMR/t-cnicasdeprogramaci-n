import java.util.Scanner;

public class Area {
    public double Calc_Area(double lado) { 
        return lado * lado;
    }
    public double Calc_Area(double base, double altura) {
        return base * altura;
    }
    public double Calc_Area(float radio) {
        return Math.PI * radio * radio;
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Area area = new Area();
        
        System.out.println("Ingrese el lado del cuadrado:");
        double lado = teclado.nextDouble();
        System.out.println("Ingresa la base del rectangulo:");
        double base = teclado.nextDouble();
        System.out.println("Ingresa la altura del rectangulo:");
        double altura = teclado.nextDouble();
        System.out.println("Ingrese el radio del cirulo:");
        double radio = teclado.nextDouble();
        
        System.out.println("Área del cuadrado   : " + area.Calc_Area(lado));
        System.out.println("Área del rectángulo : " + area.Calc_Area(base, altura));
        System.out.println("Área del círculo    : " + area.Calc_Area(radio));
    }
}
