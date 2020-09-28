
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gfrei
 */
public class tarefa_28 {

    private static String selectedValue;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resposta;
        int pergunta;
       
        JOptionPane.showMessageDialog(null, "PENSE BEM EM SUAS ESCOLHAS", "Alerta", JOptionPane.WARNING_MESSAGE);
         
        pergunta = JOptionPane.showConfirmDialog(null,"O casal Siles é o melhor do mundo?","Escolha um",JOptionPane.YES_NO_OPTION);         
        
        if(pergunta == 0) {
            JOptionPane.showMessageDialog(null, "Resposta certa, vamos para o próximo");
        } else {
            JOptionPane.showMessageDialog(null, "Nao interessa sua opiniao, eles sao os melhores e vamos para o proximo");
        }
        
        Object[] options = { "Sim" ,"Não, sou triste e não faço info" };
        resposta = JOptionPane.showOptionDialog(null, "Ja teve aulas com eles?", 
            "Aviso",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, options, options[0]);  
        
        if(resposta == 0){
                     JOptionPane.showMessageDialog(null, "Voce e feliz e tem esse privilegio (testa as outras opcoes pq acaba aqui essa parte :)");
        }else{
            Object[] itens = { "Continuar sendo triste e nao ter aula com eles", "Comecar a fazer info e ser feliz" };
            Object selectedValue = JOptionPane.showInputDialog(null,"O que voce vai fazer para ser feliz? ", 
                "Opçao",JOptionPane.QUESTION_MESSAGE, null,
                itens, itens [0]);  
            
            if(selectedValue == "Continuar sendo triste e nao ter aula com eles"){
                JOptionPane.showMessageDialog(null, "Que pessima ideia, tenho dó de voces");
            }else{
                JOptionPane.showMessageDialog(null, "Perfeita escolha, venha fazer o melhor curso e ter aula com o melhor casal");
                        }
            }
       
            
            
                                                    
    
    }
                            
        
                                                
}   
