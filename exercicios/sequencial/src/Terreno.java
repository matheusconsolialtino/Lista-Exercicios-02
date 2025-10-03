import java.util.Locale;
import java.util.Scanner;

public class Terreno {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado do terreno: ");
        double valormetroquadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * valormetroquadrado;


        System.out.printf("Area do terreno = %.2f%n", area);
        System.out.printf("Preço do terreno = %.2f%n", preco);


}


}

