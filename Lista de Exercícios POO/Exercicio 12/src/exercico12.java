import java.util.Locale;
import java.util.Scanner;

public class exercico12 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int Hi, Hf, T;

        System.out.printf("Hora inicial: \t");
        Hi = sc.nextInt();

        System.out.printf("Hora final: \t");
        Hf = sc.nextInt();
        
        if (Hf > Hi) {
            
            T = Hf - Hi;
            System.out.printf("O jogo durou %d Hora(S)\n",T);

        }else{

            T = (24 - Hi) + Hf;
            System.out.printf("O jogo durou %d Hora(S)\n",T);

        }

        sc.close();
    }
}
