import java.util.Scanner;

public class Aula01M04 {
    public static void main(String args[]) {
        // while = enquanto
        // se o valor for veradeiro ele executa e volta
        // se o valor for falso ele pula

        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        while (valor != 0) {
            valor = input.nextInt();
        }

        input.close();
    }
}
