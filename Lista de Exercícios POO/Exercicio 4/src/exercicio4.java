import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double qtm, otc=50, total;

        System.out.printf("Digite a quantidade de minutos: \t");
        qtm = sc.nextInt();

        if (qtm < 100) {
            
            total =  otc;

            System.out.printf("Valor a pagar: R$ %.2f",total);

        }
        if (qtm > 100) {
            
            total = otc + ((qtm - 100)*2);

            System.out.printf("Valor a pagar: R$ %.2f",total);

        }
        sc.close();
    }
}
