import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, x1, x2, del;

        System.out.printf("Coeficiente a \t");
        a = sc.nextDouble();

        System.out.printf("Coeficiente b \t");
        b = sc.nextDouble();

        System.out.printf("Coeficiente c \t");
        c = sc.nextDouble();

        del = (b*b) - 4*a*c;

        if (del >= 0) {
                
            x1 = (-b + Math.sqrt(del)) / (2 * a);
            
            x2 = (-b - Math.sqrt(del)) / (2 * a);
            
            System.out.printf(" X1 %.4f \n", x1);
            System.out.printf(" X2 %.4f \n", x2);
            
        }else{   
            
            System.out.println("Esta equacao nao possui raizes reais");

        }
        sc.close();
    }
}
