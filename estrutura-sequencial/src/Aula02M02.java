import java.util.Scanner;

public class Aula02M02 {
    static public void main(String args[]) {
        // entrada de dados
        Scanner input = new Scanner(System.in);

        System.out.println("Qual a sua idade");
        int idade = input.nextInt();

        int idadeAnoQueVem = idade + 1;
        System.out.println("Daqui a um ano você irá fazer " + idadeAnoQueVem + " anos.");

        input.close();
    }
}
