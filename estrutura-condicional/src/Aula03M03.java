import java.util.Scanner;

public class Aula03M03 {
    public static void main(String args[]) {
        /*
            switch case
            programa pra descrever dias da semana usando o switch case
         */


        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        String dia;

        switch (valor) {
            case 1:
                dia = "Segunda";
                break;
            case 2:
                dia = "Terça";
                break;
            case 3:
                dia = "Quarta";
                break;
            case 4:
                dia = "Quinta";
                break;
            case 5:
                dia = "Sexta";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Dia inválido";
                break;
        }

        System.out.println("Dia da semana => " + dia);

        input.close();
    }
}
