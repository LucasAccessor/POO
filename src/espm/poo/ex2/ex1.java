package espm.poo.ex2;

public class ex1 {
    
    public static void main(String[] args) {
        
        PessoaJuridica pj1 = new PessoaJuridica();
        
        Cliente pj2 = new PessoaJuridica(); // todo cliente pode ser uma pessoa juridica // polimorfismo

        Banco ehBank = new Banco("EhBank");

        ehBank.addCliente(pj1);
        ehBank.addCliente(pj2);

        pj1.setNome("humberto");
        pj1.setCnpj("12");

        pj2.setNome("nome_pessoa");
        


        System.out.println("\n" + pj1.toString());
        System.out.println(pj2.toString());

    }

}
