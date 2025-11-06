import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, x;

        System.out.printf("Primeiro valor: \t");
        a = sc.nextInt();

        System.out.printf("Segundo valor: \t");
        b = sc.nextInt();

        System.out.printf("Terceiro valor: \t");
        c = sc.nextInt();

        x = a;

        if (b < x) {
            x = b;
        }
        if (c < x) {
            x = c;
        }

        System.out.printf("O menor valor é:\t%d",x);

        sc.close();
    }
}
