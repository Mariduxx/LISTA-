
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igreja
 */
public class newjeans {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int qtd;
      
       System.out.println("Insira a quantidade de livros:");
       qtd = in.nextInt();
       
       double a = 7.50 + qtd * 0.25 ;
       double b = 2.50 + qtd * 0.50 ;
       
       if(a > b){
           System.out.println("Opção B é mais barata! \nOpção A: R$" + a +" Opção B: R$" + b);
       }
       else if(a < b){
           System.out.println("Opção B é a mais barata! \nOpção A: R$" + a +" Opção B: R$" + b);
       }
     
       
       
       
       
    
           
    
    }
    
}
