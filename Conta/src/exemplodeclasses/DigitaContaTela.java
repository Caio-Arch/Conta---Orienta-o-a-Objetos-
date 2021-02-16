
package exemplodeclasses;

import javax.swing.JOptionPane;

public class DigitaContaTela  {
    public static void main (String args []){
    int opcao = 9;
    
    String texto;
    while(opcao != 0){
    texto = JOptionPane.showInputDialog(null, "Digite <1> para conta Corrente <2> Conta Poupança <0> para Sair");
    int i;
    i = Integer.parseInt(texto);
    
    }
    for (int i=1;i<3;i++){
    if (opcao == 1){
        JOptionPane.showMessageDialog(null, "\n\n Cadastro em Conta Poupança" ); 
    }
   }
 }
}
