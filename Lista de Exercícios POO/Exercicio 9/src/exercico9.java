import java.util.Locale;
import java.util.Scanner;

public class exercico9 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quant, cod; 
        double a=5.00, b=3.00, c=4.80, d=8.90, e=7.32, valor;

        System.out.printf("Codigo do produto comprado: \t");
        cod = sc.nextInt();

        System.out.printf("Quantidade comprada: \t");
        quant = sc.nextInt();

        if (cod == 1) {
            valor = quant * a;

            System.out.printf("Valor a pagar: R$ %.2f\t",valor);
        }
        if (cod == 2) {
            valor = quant * b;

            System.out.printf("Valor a pagar: R$ %.2f\t",valor);
        }
        if (cod == 3) {
            valor = quant * c;

            System.out.printf("Valor a pagar: R$ %.2f\t",valor);
        }
        if (cod == 4) {
            valor = quant * d;

            System.out.printf("Valor a pagar: R$ %.2f\t",valor);
        }
        if (cod == 5) {
            valor = quant * e;

            System.out.printf("Valor a pagar: R$ %.2f\t",valor);
        }


        sc.close();
    }
}
