import java.util.Locale;
import java.util.Scanner;

public class exercico13 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.printf("Valor de X :\t");
        x = sc.nextDouble();

        System.out.printf("Valor de Y :\t");
        y = sc.nextDouble();

        if (x == 0 && y == 0) {

            System.out.printf("Origem\t");

        }else if (y == 0) {

            System.out.printf("Eixo X\t");

        }else if (x == 0) {

            System.out.printf("Eixo Y\t");

        }else if (x > 0 && y > 0) {

            System.out.printf("Q1\t");

        }else if (x < 0 && y > 0) {

            System.out.printf("Q2\t");

        }else if (x < 0 && y < 0) {

            System.out.printf("Q3\t");

        }else if (x > 0 && y < 0) {

            System.out.printf("Q4\t");

        }

        sc.close();
    }
}
