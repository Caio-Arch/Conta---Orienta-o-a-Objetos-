
package exemplodeclasses;


public class ContaPoupanca extends Conta{
    String dataAniversario;
    void saqueConta(double valor, double setsaldo){
        double x=0;
        if (setsaldo < 0)
                System.out.print("Erro, sua conta ficará negativa!");
        else{ 
             x= this.getsaldo() - valor; 
            
            this.setsaldo(x);
            
      }
    }
}