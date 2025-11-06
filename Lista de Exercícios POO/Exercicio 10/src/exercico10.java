import java.util.Locale;
import java.util.Scanner;

public class exercico10 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.printf("Digite dois numeros inteiros:\n");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n2 != 0 && n1 % n2 == 0) {

            System.out.printf("%d É MÚLTIPLO de %d.\n", n1, n2);

        }else if (n1 != 0 && n2 % n1 == 0) {

            System.out.printf("%d É MÚLTIPLO de %d.\n", n2, n1);

        }else{

            System.out.printf("Os números %d e %d NÃO são múltiplos um do outro.\n", n1, n2);

        }

        sc.close();
    }
}
