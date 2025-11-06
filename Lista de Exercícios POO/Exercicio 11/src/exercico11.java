import java.util.Locale;
import java.util.Scanner;

public class exercico11 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sala, Nsala, Aume;

        System.out.printf("Digite o salario da pessoa: R$ \t");
        sala = sc.nextDouble();

        if (sala <= 1000) {

            Aume = sala * 0.2;
            Nsala = sala + Aume;

            System.out.printf("Novo salario:\tR$ %.2f\n",Nsala);
            System.out.printf("Aumento:\tR$ %.2f\n",Aume);
            System.out.printf("Porcentagem:\t20%%");
        }
        if (sala > 1000 && sala <= 3000) {

            Aume = sala * 0.15;
            Nsala = sala + Aume;

            System.out.printf("Novo salario:\tR$ %.2f\n",Nsala);
            System.out.printf("Aumento:\tR$ %.2f\n",Aume);
            System.out.printf("Porcentagem:\t15%%");
        }
        if (sala > 3000 && sala <= 8000) {

            Aume = sala * 0.1;
            Nsala = sala + Aume;

            System.out.printf("Novo salario:\tR$ %.2f\n",Nsala);
            System.out.printf("Aumento:\tR$ %.2f\n",Aume);
            System.out.printf("Porcentagem:\t10%%");
        }
        if (sala > 8000) {

            Aume = sala * 0.05;
            Nsala = sala + Aume;

            System.out.printf("Novo salario:\tR$ %.2f\n",Nsala);
            System.out.printf("Aumento:\tR$ %.2f\n",Aume);
            System.out.printf("Porcentagem:\t5%%");
        }

        sc.close();
    }
}
