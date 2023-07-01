import java.util.Scanner;

public class Aula05M04 {
    public static void main(String[] args) {
        // estrutura de repeticao do-while

        Scanner input = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("Escolha uma opção");
            System.out.println("1 = Iniciar jogo");
            System.out.println("2 = Carregar jogo");
            System.out.println("3 = Ajuda");
            System.out.println("4 = Sair");
            opcao = input.nextInt();
        } while (opcao != 4);

    }
}
