
package exemplodeclasses;

import java.util.Scanner;
import java.lang.Math;


public class DigitaConta extends Conta {
    
    public static void main(String[] args) {
        
    
        Scanner entrada = new Scanner(System.in);
        double opcao, numeroConta, numeroCliente;
        double numeroContaCr, numeroContaCp, numeroClienteCr, numeroClienteCp;
        int dia, mes, ano;
    
        System.out.print("Digite 1 para Conta Corrente e 2 para Conta poupança: ");
        opcao = entrada.nextDouble();
        
        if (opcao == 1)
        {          
            
            System.out.print("Ótimo, o numero da sua conta corrente é: " );
            Scanner numerocr = new Scanner(System.in);
            numeroContaCr = numerocr.nextInt();
            
            
            System.out.print("Ótimo, o seu numero como cliente será: " );
            Scanner numeroclientecr = new Scanner(System.in);
            numeroContaCr = numeroclientecr.nextInt();
            
        } else{
            System.out.print("Que bom, para abrir conta poupança, digite o numero de conta desejado: ");
            Scanner numerocp = new Scanner(System.in);
            numeroContaCp = numerocp.nextInt();
            
            System.out.print("Ótimo, o seu numero como cliente será: " );
            Scanner numeroclientecr = new Scanner(System.in);
            numeroContaCr = numeroclientecr.nextInt();
        }
    }
}
