import java.util.Locale;
import java.util.Scanner;

public class Duracao {

public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a média A: ");
        double A = sc.nextDouble();

        System.out.print("Digite a média B: ");
        double B = sc.nextDouble();

        System.out.print("Digite a média C: ");
        double C = sc.nextDouble();

        double areaQuadrado = Math.pow(A, 2);               
        double areaTriangulo = (A * B) / 2.0;  
        double areaTrapezio = ((A + B) * C) / 2.0;     

        System.out.printf("ÁREA DO QUADRADO = %.4f%n", areaQuadrado);
        System.out.printf("ÁREA DO TRIÂNGULO = %.4f%n", areaTriangulo);
        System.out.printf("ÁREA DO TRAPÉZIO = %.4f%n", areaTrapezio);

        sc.close();

}
}