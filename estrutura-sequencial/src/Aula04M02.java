public class Aula04M02 {
    static public void main(String args[]) {
        // balanço trimestral

        int gastosJaneiro = 1500;
        int gastosFevereiro = 2500;
        int gastosMarco = 1750;
        int gastosTrimestre =  gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("Gastos do trimestre: R$" + gastosTrimestre);
        int mediaMes = gastosTrimestre / 3;
        System.out.println("Média mensal: R$" + mediaMes);
    }
}
