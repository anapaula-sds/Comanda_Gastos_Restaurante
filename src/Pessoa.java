public class Pessoa {

     String nome;
     double despesas;

    public Pessoa(String nome, double despesas) {
        this.nome = nome;
        this.despesas = despesas;
    }//Fim do Construtor

    public String getNome() {
        return nome;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }
}//Fim da Classe Pessoa
