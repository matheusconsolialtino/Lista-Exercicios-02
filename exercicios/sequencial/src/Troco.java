import java.util.Locale;
import java.util.Scanner;

public class Troco {
public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço unitario do produto: ");
        double precounitario = sc.nextDouble();


        System.out.print("Digite a quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiro = sc.nextDouble();


        double compratotal = precounitario * quantidade;
        double troco = dinheiro - compratotal;

        
if (dinheiro >= compratotal) {
    
        System.out.printf("Troco = %.2f%n", troco);

} else {

    System.out.print("Dinheiro insuficiente :(");
}
}
}
