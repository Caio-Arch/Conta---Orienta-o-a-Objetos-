

package exemplodeclasses;
    
abstract public class Conta { // Classe Abstrada por não gerar um objeto
    static int numeroConta; 
    int numeroCliente;
    private double saldo; // Encapsulamento
    protected String dataAbertura; //Encapsulamento
    int contas;
    
    public double getsaldo(){ // Método Get
        return this.saldo;
    }
    public void setsaldo(double saldo){ //Método Set
        this.saldo = saldo;
    } 
    
    void depositoConta(double valor){
        saldo = saldo + valor;
    }
    void saqueConta(double valor){
        saldo = saldo - valor;
    }
    Conta(){
        saldo = 100.00;
    }
}