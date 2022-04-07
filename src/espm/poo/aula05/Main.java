package espm.poo.aula05;

import espm.poo.ex2.Cliente;

public class Main {
    public static void main(String[] args) {
        
        Cliente cli = new Cliente();

        cli.getConta().depositar(10);
        System.out.println(cli.getConta().getSaldo());
        

    }
}
