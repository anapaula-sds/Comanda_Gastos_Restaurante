public class CalcularGastos {

    static double imposto = 0.05; //Imposto de 5%
    static double gorjeta = 0.15; //Gorjeta de Serviços de 15%

    public CalcularGastos (){

    }//Fim do Construtor

    public double getImposto() {
        return imposto;
    }

    public double getGorjeta() {
        return gorjeta;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void setGorjeta(double gorjeta) {
        this.gorjeta = gorjeta;
    }

    public static double calcTotal(double despesas){

        double gastoTotal = despesas * (1 + imposto + gorjeta);
        return gastoTotal;

    }//Fim do Metodo calcTotal

}//Fim Classe CalcularGastos
