import java.util.Locale;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida: ");
        double distancia = sc.nextDouble();

        System.out.print("Digite o combustivel gastos: ");
        double combustivel = sc.nextDouble();

        double consumomedio = distancia / combustivel;

        System.out.printf("Consumo médio = %.3f%n", consumomedio);


        sc.close();




}
}
