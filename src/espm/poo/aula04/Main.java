package espm.poo.aula04;

public class Main {

    public static void main(String[] args){
        Aluno a1 = new Aluno(44L, "hert"); //L no final por causa do tipo Long*
        System.out.println(a1);
        Aluno a2 = new Aluno(89L, "kyp"); //L no final por causa do tipo Long*
        System.out.println(a2);


        if (a1.equals(a2)) {
            System.out.println("sâo iguais");
        } else {
            System.out.println("Nâo são iguais");
        }
    }
}
