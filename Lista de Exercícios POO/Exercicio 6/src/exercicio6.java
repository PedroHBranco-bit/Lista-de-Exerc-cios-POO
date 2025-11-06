import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double gli;

        System.out.printf("Digite a medida da glicose: \t");
        gli = sc.nextDouble();

        if (gli <= 100) {

            System.out.printf("Classificação: Normal \n");

        }
        if (gli > 100 & gli <= 140) {

            System.out.printf("Classificação: Elevado \n");

        }
        if (gli > 140) {

            System.out.printf("Classificação: Diabetes \n");

        }

        sc.close();
    }
}