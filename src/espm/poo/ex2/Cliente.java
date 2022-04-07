package espm.poo.ex2;

public class Cliente {

    private String nome;
    private String cpf;
    private Conta conta;

    //construtor
    public Cliente(){
        conta = new Conta(this); // o this refere-se ao objeto sendo criado, que é exigido pelo outro método construtor
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public Conta getConta(){
        return conta;
    }

    @Override
    public String toString() { //sobrescreve o método dentro da classe
        return "{nome: " + nome + 
               " cpf: " + cpf +
               " conta: " + conta + "}";
    }

}
