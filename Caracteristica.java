import java.util.Scanner;

public class Caracteristica {
    public static void main (String[] args){
        var scanner = new Scanner (System.in);
        System.out.println ("Insira sua altura: ");
        double altura = scanner.nextDouble ();
        System.out.println ("Insira seu peso");
        double peso = scanner.nextDouble ();

        double IMC = peso/ (altura * altura);

        if (IMC <= 18.5){
            System.out.printf("IMC = %f\n", IMC);
            System.out.printf("Abaixo do peso");
        }
        else if (IMC >= 18.6 && IMC <= 24.9){
            System.out.printf("IMC = %f\n", IMC);
            System.out.printf("Peso ideal");
        }
        else if (IMC >= 25.0 && IMC <= 29.9){
            System.out.printf("IMC = %f\n", IMC);
            System.out.printf("Levemente acima do peso");
        }
        else if (IMC >= 30.0 && IMC <= 34.9){
            System.out.printf("IMC = %f\n", IMC);
            System.out.printf("Obesidade Grau I");
        }
        else if (IMC >= 35.0 && IMC <= 39.9){
            System.out.printf("IMC = %f\n", IMC);
            System.out.printf("Obesidade Grau II (Severa)");
        }
        else if (IMC > 40.0){
            System.out.printf("IMC = %f\n", IMC);
            System.out.printf("Obesidade III (Mórbida)");
        }
    }
}
