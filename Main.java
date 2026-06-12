import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        var num = scanner.nextInt();
        var result = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            result = num * i;
            System.out.printf("%d * %d = %d\n", num, i, result);
        }
    }
}
