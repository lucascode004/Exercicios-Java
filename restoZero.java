import java.util.Scanner;

public class restoZero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero");
        var num1 = scanner.nextInt();

        var keepVerify = true;

        while (keepVerify){
            System.out.println("Informe o numero para ser verificado");
            var toVerify = scanner.nextInt();
            if (toVerify < num1){
                System.out.printf("INFORME UM NUMERO MAIOR QUE %s\n",    num1);
                continue;
            }

            var result = toVerify % num1;
            keepVerify = result % num1 == 0;
            System.out.printf("%s %% %s = %s\n",   toVerify, num1, result);
        }


    }

}
