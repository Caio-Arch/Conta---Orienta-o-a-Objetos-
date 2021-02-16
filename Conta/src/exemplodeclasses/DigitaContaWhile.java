
package exemplodeclasses; //nome do pacote "pasta" do projeto
import java.util.Scanner; //importar classe Scanner para tratar a entrada via teclado

public class DigitaContaWhile {
    public static void main (String args []){
        Scanner tc = new Scanner (System.in); //instância da classe Scanner, gerando o objeto tc
        int opcao = 9;
        
        while (opcao !=0){
            System.out.print("Escolher <1> para Poupança, <2> para Corrente <0> para Sair: ");
            opcao = tc.nextInt();
            
            if (opcao == 1){
                ContaPoupanca cp = new ContaPoupanca(); //instância da classe ContaPoupança, gerando o objeto cp
                
                System.out.println("\n\n Cadastro em Conta Poupança"); //segue a digitação dos dados
                
                while(ContaPoupanca.numeroConta == 0){ //atributo static e exemplo de consistência com While
                    System.out.print ("Digite o numero da conta");
                    ContaPoupanca.numeroConta = tc.nextInt();
                }
                
                do{                                    // exemplo de consistência com DO WHILE
                    System.out.print("Digite o numero do cliente");
                    // ContaPoupanca.numeroConta=68;// Exemplo static                        
                    ContaPoupanca.numeroConta = tc.nextInt();
                } while (cp.numeroCliente == 0);
                
                System.out.print("Digite a data de abertura");
                cp.dataAbertura = tc.next();       //chamada de método saque e depósito com valor passando por digitação
                
                System.out.print("Digite o valor de depósito: ");
                cp.depositoConta(tc.nextDouble());
                
                System.out.print("Digite o valor de saque: ");
                cp.saqueConta(tc.nextDouble());
                
                System.out.println("Agora, seu saldo em conta poupançA é: " +cp.getsaldo());
                
            }
            
            if (opcao == 2){
                ContaCorrente cc = new ContaCorrente();
                
                System.out.println("\n\n Cadastro em conta Corrente");
                System.out.print("Digite o numero da conta : ");
                ContaCorrente.numeroConta = tc.nextInt();
                
                System.out.print("Digite o numero do cliente: ");
                cc.numeroCliente = tc.nextInt();
                
                System.out.print("Digite a data de abertura:");
                cc.dataAbertura = tc.next();
                
                System.out.print("Digite o valor do depósito: ");
                cc.depositoConta(tc.nextDouble());
                
                System.out.print("Digite o valor do saque: ");
                cc.saqueConta(tc.nextDouble());
                
                System.out.println("Agora, seu saldo em conta corrente é: " +cc.getsaldo()); //usando metodo Get
            }
        }
    }
 
    
     
}
