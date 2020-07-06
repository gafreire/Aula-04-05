
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel Freire
 */
public class atividade0607 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ativ = new Scanner(System.in);
        
        String nome[] = new String[5];
        
        for (int i = 0; i < nome.length; i++) {
           System.out.println("Escreva o nome da posicao " +i);
           nome[i]=ativ.next(); 
        }
        for ( int i = 0; i < nome.length; i++) {
            System.out.println("O nome do vetor " +i+ " é: " +nome[i]);
        }
         System.out.println("--------------------------------");
         
         int num[] = new int[10];
         
        for (int i = 0; i < num.length; i++) {
           System.out.println("Escreva o numero da posicao " +i);
            num[i]=ativ.nextInt(); 
        }
        
        for ( int   i = 0; i < num.length; i++) {
            System.out.println("O nome do vetor " +i+ " é: " +num[i]);
        }
        
        System.out.println("--------------------------------");
        
        for ( int  i = num.length-1; i >= 0; i--) {
            System.out.println("O nome do vetor " +i+ " é: " +num[i]);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
