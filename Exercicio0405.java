/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author Gabriel Freire
 */
public class Exercicio0405 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner exercicio = new Scanner(System.in);
       
        // 1
        String nome;
        
        System.out.println("Digite seu nome");
        nome = exercicio.next();
        System.out.println("Ola "+nome+". Seja bem vindo");
        
        // 2
        String nome2;
        float num1, num2, num3, num4, media;
        
        System.out.println("Digite seu nome:");
        nome2 = exercicio.next();
        System.out.println("Digite sua primeira nota de matematica:");
        num1 = exercicio.nextFloat();
        System.out.println("Digite sua segunda nota de matematica:");
        num2 = exercicio.nextFloat();
        System.out.println("Digite sua terceira nota de matematica:");
        num3 = exercicio.nextFloat();
        System.out.println("Digite sua quarta nota de matematica:");
        num4 = exercicio.nextFloat();
        
        media = (num1 + num2 + num3 + num4) / 4;
        System.out.println("Sua media final é: " +media);
        
        //3
        
        int entrada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar um número: ");
        entrada = scanner.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println("A tabuada e: "+resultado);   
            multiplicador++;
        }
        
        //4
        
        float A, b, h;
        
        System.out.println("Digite a base do triangulo:");
        b = exercicio.nextFloat();
        
        System.out.println("Digite a altura do triangulo:");
        h = exercicio.nextFloat();
        
        A = (b * h) / 2;
        System.out.println("A area do triangulo e " +A);
        
        float l, A2;
        System.out.println("Digite o lado do Quadrado");
        l = exercicio.nextFloat();
        
        // Math.pow(l, 2); Usado para potencias
        A2 = l * l;
        System.out.println("A area do quadrado e " +A2);
        
        double imc, kg, altura;
        
        System.out.println("Digite sua altura:");
        altura = exercicio.nextFloat();
        System.out.println("Digite seu peso: ");
        kg = exercicio.nextFloat();
        
        imc = kg / (altura * altura);
        System.out.println("Seu IMC e: " +imc);
        
        //5 
        
        float km, milhas;
        
        System.out.println("Digite a quantidade de Km: ");
        km = exercicio.nextFloat();
        
        milhas = (float) (km / 1.60934);
        System.out.println("A quantidade de milhas e " +milhas);
        
        //6
        
        int meses, dias;
        
        System.out.println("Digite a quantidade de meses ");
        meses = exercicio.nextInt();
        
        dias = meses * 30;
        System.out.println("Nessa quantidade de meses tem " +dias+ " dias");
        
    }
    
}