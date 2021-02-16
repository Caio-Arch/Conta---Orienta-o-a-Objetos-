
package exemplodeclasses;

public class TesteExemplodeClasse {
    
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();
        cp.saqueConta(30.00);
        System.out.println("Saldo em poupança: R$ " + cp.getsaldo());
        
        ContaCorrente cr = new ContaCorrente();
        cr.saqueConta(500.00);
        System.out.println("Saldo em conta corrente: R$ " + cr.getsaldo());
    }
}
