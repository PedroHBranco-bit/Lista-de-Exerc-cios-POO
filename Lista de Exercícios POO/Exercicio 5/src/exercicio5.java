import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantC;
        double preçoU, valorD, troco;

        System.out.printf("Preço unitário do produto:\tR$ ");
        preçoU = sc.nextDouble();

        System.out.printf("Quantidade comprada: \t");
        quantC = sc.nextInt();

        System.out.printf("Dinheiro recebido:\tR$ ");
        valorD = sc.nextDouble();

        troco = valorD - (preçoU * quantC);

        if (troco < valorD) {
            

            System.out.printf("Dinheiro insuficiente: Faltam R$ %.2f \n",troco*-1);

        }else{

            System.out.printf("Troco: R$ %.2f \n",troco);

        }
        sc.close();
    }
}
