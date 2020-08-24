/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licoes;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author gfrei
 */
public class Licoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Qual seu nome? ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));
        String end = JOptionPane.showInputDialog("Qual seu endereco? ");
        
        int resposta = JOptionPane.showConfirmDialog(null, "O seu nome é: " +nome+ "? Sua idade é: " + idade + "? E seu endereco é: " + end);
        
        if(resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Bem vindo " +nome);
        } else {
            JOptionPane.showMessageDialog(null, "Dados não confirmados");
        }
       
        
        
    }
    
}
