import java.util.Locale;
import java.util.Scanner;

public class MediaIdade {
 public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();

        System.out.print("Digite a idade da primeira pessoa ");
        int idade1 = sc.nextInt();
        sc.nextLine();


        System.out.print("Digite o nome da Segunda pessoa: ");
        String nome2 = sc.nextLine();

        System.out.print("Digite a idade da Segunda pessoa ");
        int idade2 = sc.nextInt();


        double media = (idade1 + idade2) / 2.0  ;

        System.out.printf("  A idade média de %s e %s é de %.1f anos.%n", nome1, nome2, media);

    

}
}