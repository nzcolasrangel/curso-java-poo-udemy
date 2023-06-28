import java.util.Locale;
import java.util.Scanner;

public class Aula05M02 {
    static public void main(String args[]) {
        // media dos alunos

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Nome do aluno: ");
        String nomeAluno = input.next();

        System.out.println("Primeira nota");
        double primeiraNota = input.nextDouble();

        System.out.println("Segunda nota");
        double segundaNota = input.nextDouble();

        System.out.println("Terceira nota");
        double terceiraNota = input.nextDouble();

        double media = primeiraNota + segundaNota + terceiraNota / 3;

        System.out.printf("O aluno " + nomeAluno + " tirou a média %.2f%n", media);

        input.close();
    }
}
