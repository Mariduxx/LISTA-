

package com.mycompany.mavenproject4;

import java.util.Scanner;

public class Mavenproject4 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
    float nota1, nota2, nota3, rec;
        
           System.out.println("Insira a primeira nota:");
           nota1 = in.nextFloat();
        
           System.out.println("Insira a segunda nota:");
           nota2 = in.nextFloat();        
        
           System.out.println("Insira a terceira nota:");
           nota3 = in.nextFloat();
           
           float media = (nota1+nota2+nota3)/3  ;
           
           if(media < 7){
               System.out.println("O ALUNO FOI REPROVADO.\nMédia:" + media );
               System.out.println("Digite a nota da Recuperação:");
               rec = in.nextFloat();
               
               float li = (media+rec)/2;
               
               if(li > 5){
                   System.out.println("O ALUNO PASSOU NA RECPAR");
               }
               else if(li < 5){
                   System.out.println("O ALUNO FOI REPROVADO NA RECPAR");
               }
           }
           else if (media >= 7){
               System.out.println("O ALUNO FOI APROVADO. \nMédia:" + media );
           
           }
        
                   
      
    }
}
