import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, x;

        System.out.printf("Digite as tres distancias: \t");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        x = a;

        if (b > x) {
            x = b;
        }
        if (c > x) {
            x = c;
        }

        System.out.printf("MAIOR DISTANCIA: %.2f \t",x);

        sc.close();
    }
}
