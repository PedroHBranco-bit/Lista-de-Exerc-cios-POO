import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double Nota1, Nota2, NotaF;

        System.out.printf("Digite a primeira nota \t");
        Nota1 = sc.nextDouble();

        System.out.printf("Digite a segunda nota \t");
        Nota2 = sc.nextDouble();

        NotaF = Nota1 + Nota2;

        System.out.printf("A nota final é %.1f \n",NotaF);

        if (NotaF < 60.0) {
            
            System.out.println("Reprovado");

        }

        if (NotaF >= 60) {
            
            System.out.println("Aprovado");

        }
        sc.close();
    }
}
