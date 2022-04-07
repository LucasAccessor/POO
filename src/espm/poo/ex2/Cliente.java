package espm.poo.ex2;

public class Cliente {

    private String nome;
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


    public Conta getConta(){
        return conta;
    }


}
