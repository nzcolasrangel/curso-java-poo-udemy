import java.util.Scanner;

public class Aula01M03 {
    public static void main(String args[]) {
        // if e else
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();

        if (valor < 10) {
            System.out.println("If em execução");
        } else {
            System.out.println("Else em execução");
        }

        input.close();
    }
}
