import java.util.Scanner;

public class Aula03M04 {
    public static void main(String[] args) {
        // exercicio 01

        Scanner input = new Scanner(System.in);

        int senha = input.nextInt();

        while (senha != 2002) {
            System.out.println("Senha invalida");
            senha = input.nextInt();
        }

        System.out.println("Senha correta");

        input.close();
    }
}
