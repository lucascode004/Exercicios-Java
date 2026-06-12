import java.util.Scanner;

public class parImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero");
        int num1 = scanner.nextInt();
        System.out.println("Insira outro numero");
        int num2 = scanner.nextInt();

        while (num1 >= num2){
            System.out.println("Numero invalido, o segundo numero precisa ser maior");
            System.out.println("Digite outro numero");

            num2 = scanner.nextInt();
        }

        String option = scanner.next();

        switch (option){
            case "par":
                for (int i = num1; i <= num2; i++){
                    if (i % 2 == 0){
                        System.out.println(i);
                    }
                }
                break;

            case "impar":
                for (int i = num1; i <= num2; i++){
                    if (i % 2 == 1){
                        System.out.println(i);
                    }
                }
                break;
        }
    }

}
