package Dowhile;

public class while2{
    public static void main(String[] args){
       java.util.Scanner teclado = new java.util.Scanner(System.in);
       System.out.println("Tabuada. Escreva um numero");
       int numero = teclado.nextInt();
       
       int multiplicador = 0;
       
       while(multiplicador <= 10){ 
          int resultado = numero * multiplicador;
          System.out.println(resultado);
          multiplicador++;
        }
        
        System.out.println("Ate mais");
    }
}
