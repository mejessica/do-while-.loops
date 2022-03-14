package Dowhile;

public class while6 { 
    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        System.out.println("Digite 0 para sair");
       
        
        int opcao = 0;
        int opcao2 = 0;
        
        double reaisLar = 0;
        int unidadesLar = 0;
        
        double reaisAlfa = 0;
        int unidadesAlfa = 0;
        
        double reaisMor = 0;
        int unidadesMor = 0;
        
        double reaisCen = 0;
        int unidadesCen = 0;
        
        
        int contador = 0;
        do{
            
            System.out.println("MENU: ");
            System.out.println("0- Sair ");
            System.out.println("1- Vender produto ");
            System.out.println("2- Quantidade em reais");
            System.out.println("3- Quantidade em unidades ");
            
            opcao2 = teclado.nextInt();
            
            
            if(opcao2 == 1){
            System.out.println("Digite o cÃ³digo do produto para a compra");
            System.out.println(" ");
            System.out.println("----catalogo de produtos----");
            System.out.println("Codigo - Nome ----- Preco em R$");
            System.out.println("123 - Laranja ------------ 1,00");
            System.out.println("124 - Bandeja de morango - 5,00");
            System.out.println("125 - Alface --------------2,50");
            System.out.println("126 - Cenoura ------------ 2,00");
            
            opcao = teclado.nextInt();
              
           
              
              
              if (opcao == 123) {
                    reaisLar += 1.00;
                    unidadesLar++;
                    
                } else if (opcao == 124){
                    reaisMor += 5.00;
                    unidadesMor++;
                    
                } else if (opcao == 125) {
                    reaisAlfa += 2.50;
                    unidadesAlfa++;
                    
                } else if (opcao == 126) {
                    reaisCen += 2.00;
                    unidadesCen++;
                  
                }
                
            
           } else if(opcao2 == 2) {
           
              System.out.println("Total de reais no dia por produto");
              System.out.println(" ");
              System.out.println("Laranja "+reaisLar);
              System.out.println("Morango "+reaisMor);
              System.out.println("Alface "+reaisAlfa);
              System.out.println("Cenoura "+reaisCen);
              System.out.println(" ");
              
           } else if(opcao2 == 3) {
           
              System.out.println("Total de unidades no dia por produto");
              System.out.println(" ");
              System.out.println("Laranja "+unidadesLar);
              System.out.println("Morango "+unidadesMor);
              System.out.println("Alface "+unidadesAlfa);
              System.out.println("Cenoura "+unidadesCen);
              System.out.println(" ");
           }
        
    
        } while((contador != 0)&&(contador <= 4));
       
        
            System.out.println("Volte sempre!");
    }
}
