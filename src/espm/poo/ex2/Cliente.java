package espm.poo.ex2;

public abstract class Cliente {

    private String nome;
    private String sobrenome;
    private Conta conta;

    //construtor
    public Cliente(){
        conta = new Conta(this); // o this refere-se ao objeto sendo criado, que é exigido pelo outro método construtor
    }

    public void setNome(String nome) {
        String[] nomes = nome.split(" ");
        this.nome = nomes[0];
        this.sobrenome = [nomes.length - 1];
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }


    public Conta getConta(){
        return conta;
    }


}
