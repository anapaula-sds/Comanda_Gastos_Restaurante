public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Ana", 20.00);
        Pessoa pessoa2 = new Pessoa("Johnny", 30.00);
        Pessoa pessoa3 = new Pessoa("Stephanny", 40.00);

        double buscaDespesa1 = pessoa1.getDespesas();
        double totalGasto1 = CalcularGastos.calcTotal (buscaDespesa1);
        System.out.println(pessoa1.getNome() + " deve pagar R$" + totalGasto1);
        System.out.println("----------------------------------");

        double buscaDespesa2 = pessoa2.getDespesas();
        double totalGasto2 = CalcularGastos.calcTotal (buscaDespesa2);
        System.out.println(pessoa2.getNome() + " deve pagar R$" + totalGasto2);
        System.out.println("----------------------------------");

        double buscaDespesa3 = pessoa3.getDespesas();
        double totalGasto3 = CalcularGastos.calcTotal (buscaDespesa3);
        System.out.println(pessoa3.getNome() + " deve pagar R$" + totalGasto3);
        System.out.println("----------------------------------");

    }
}