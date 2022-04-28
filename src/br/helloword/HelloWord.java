/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.helloword;
/**
 *
 * @author Marce
 */
public class HelloWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ola, Mundo!");     
   
        if (5 > 5){
            System.out.println("Primeiro e maior");
        }else{
            System.out.println("Segundo e maior");
        }
        
        
         if (5 < 5){
            System.out.println("Segundo e maior");
        }else{
            System.out.println("Primeiro e maior");
        }


         if (5 <= 5){
            System.out.println("Segundo e maior");
        }else{
            System.out.println("Primeiro e maior");
        }
    }
}

    // a > b = Primeiro e maior // 5=>5 primeiro e maior
    // a < b = segundoe maior // 5<=5  Segundo e maior
    // a <= b = Segundo e maior // 5<= 5 Primeiro e maior




// FATORIAL
/*      System.out.print("Digite um numero: ");
        Scanner ler = new Scanner(System.in);
        
        int i = ler.nextInt();
        int con = i;                 
        int fat =1; 
        
        while (con >= 1){
            fat *= con;
            con--; 

            System.out.println(fat);  

        }
*/