import java.util.Scanner;

public class Scanners {

    //Exercício de scanners


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite três doubles");
        double a, b,c;
        a= scan.nextDouble();
        b = scan.nextDouble();
        c= scan.nextDouble();

        System.out.printf("Triangulo: %.2f%n", a*c/2);
        System.out.printf("Circulo: %.2f%n" , Math.PI*c*c );
        System.out.printf("Trapezio: %.2f%n" , (a+b)*c/2);
        System.out.printf("Quadrado: %.2f%n" , b*b );
        System.out.printf("Retangulo: %.2f%n" , a*b);
        scan.close();
    }
}
