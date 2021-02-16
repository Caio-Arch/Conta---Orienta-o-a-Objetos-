package exemplodeclasses;
import java.util.Scanner;

public class DigitaContaProf {
    public static void main (String args[]){
        Scanner tc = new Scanner(System.in); // instância da classe Scanner, gerando o objeto tc
        Scanner tp = new Scanner(System.in);
        ContaPoupanca cp = new ContaPoupanca(); // instância da classe ContaPoupança, gerando objeto cp
        ContaCorrente cc = new ContaCorrente ();
        
        System.out.println("Cadastro em Conta Poupança!");
        System.out.print("Digite o numero da conta: ");
        ContaPoupanca.numeroConta = tc.nextInt();
        
        System.out.print("Digite o numero do cliente: ");
        ContaPoupanca.numeroConta = tc.nextInt();
        
        System.out.print("Digite a data de abertura: ");
        cp.dataAbertura = tc.next();
        
        System.out.print("Digite o valor do deposito: R$ ");
        cp.depositoConta(tc.nextDouble());
        
        System.out.print("Digite o valor do saque: R$ ");
        cp.saqueConta(tc.nextDouble());
        
        System.out.println("Agora seu saldo é: R$ " + cp.getsaldo());
        
        
        System.out.println("Cadastro em Conta Corrente!");
        System.out.print("Digite o numero da conta: ");
        ContaCorrente.numeroConta = tp.nextInt();
        
        System.out.print("Digite o numero do cliente: ");
        ContaCorrente.numeroConta = tp.nextInt();
        
        System.out.print("Digite a data de abertura: ");
        cc.dataAbertura = tp.next();
        
        System.out.print("Digite o valor do deposito: R$ ");
        cc.depositoConta(tp.nextDouble());
        
        System.out.print("Digite o valor do saque: R$ ");
        cc.saqueConta(tp.nextDouble());
        
        System.out.print("Agora seu saldo é: R$ " + cc.getsaldo());
    }
}
