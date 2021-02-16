
package exemplodeclasses;

import java.util.Arrays;
import javax.swing.JOptionPane; //importação para Classe JOptionPane

public class  CadastroContaCorrente extends Conta{ //herança
    public static void main (String[] args){
    String nome;
    int [] array = new int[4]; // Array

    char opcao;
    do{
        String escolha = JOptionPane.showInputDialog(null, "Menu:\n\n I - Inserir 1 para conta corrente e 3 para sair");
        opcao = escolha.charAt(0);
        for(int i=0;i<4;i++){
            if (opcao == '1'){
                array[i]=Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da"+" conta","Informe somente o numero"));
                nome = JOptionPane.showInputDialog(null,"Por Favor,Digite o"+"nome","Informe somente Letras");
                JOptionPane.showMessageDialog(null,nome+" Armazenada com sucesso"+" Conta Numero "+array[i]);    
            }else if (opcao =='2'){
                JOptionPane.showMessageDialog(null,"Opção Invalida");
            }
        }
        
    }while(opcao!='3');
    JOptionPane.showMessageDialog(null,"Saindo da sua conta");
    
  }

}