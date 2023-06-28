import java.util.Scanner;

public class Aula03M02 {
    static public void main(String args[]) {
        // calculadora
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número");
        int valor1 = input.nextInt();
        System.out.println("Informe mais um número");
        int valor2 = input.nextInt();

        int soma = valor1 + valor2;
        int subtracao = valor1 - valor2;
        int multiplicacao = valor1 * valor2;
        int divisao = valor1 / valor2;

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);

        input.close();
    }
}
