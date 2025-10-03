import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
   public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionario: ");
        String nomefunc = sc.nextLine();

        System.out.print("Digite o valor de horas trabalhadas:  ");
        double valohrs = sc.nextDouble();

        System.out.print("Diite a quantidade de horas trabalhadas: ");
        int horastrb = sc.nextInt();

        double pagamento = valohrs * horastrb;

        System.out.printf("O pagamento para %s deve ser %.2f%n", nomefunc, pagamento);

        sc.close();


}
}