package espm.poo.ex2;

public class Conta {

    private int id;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        this.cliente = cliente;
    }


    public double getSaldo(){
       return this.saldo;
       /* int x = 2;
       return x > 0 ? "Positivo" : x < 0 ? "Negativo" : "Zero"; //ternário */
    }

    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = saldo - valor;
        } else {
            System.out.println("sAlDo INsuFiCIeNtE");
        }
        
    }

    public void depositar(double valor){
        if (valor > 0){
        this.saldo = this.saldo + valor;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    /*public void setCliente(Cliente cliente) {
        if (cliente == null){
            throw new UnsupportedOperationException();
        }
        this.cliente = cliente;
    } */

}