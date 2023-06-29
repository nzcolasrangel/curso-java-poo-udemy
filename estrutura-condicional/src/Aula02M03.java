import java.util.Scanner;

public class Aula02M03 {
    public static void main(String args[]) {
            // else if
            Scanner input = new Scanner(System.in);

            int valor = input.nextInt();

            if (valor > 10) {
                System.out.println("if em execução");
            } else if (valor < 5) {
                System.out.println("else if em execução");
            } else {
                System.out.println("else em execução");
            }

            input.close();
        }
    }
