import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        char x; 
        Double tempC, tempF, tempS;

        System.out.printf("Voce vai digitar a temperatura em qual escala (C/F)? \n");
        x = sc.next().toUpperCase().charAt(0);

        if(x != 'C' || x != 'F'){
             System.out.printf("Escala de temperatura invalida");
        }

        if (x == 'F') {

            System.out.printf("Digite a temperatura em Fahrenheit:");
            tempF = sc.nextDouble();

            tempS = (5.0 / 9.0) * (tempF - 32.0);

            System.out.printf("Temperatura equivalente em Celsius: %.2f \n",tempS);

        }
        if (x == 'C') {

            System.out.printf("Digite a temperatura em Celsius:");
            tempC = sc.nextDouble();

            tempS = (tempC * 9.0 / 5.0) + 32.0;

            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f \n",tempS);

        }

        sc.close();
    }
}
