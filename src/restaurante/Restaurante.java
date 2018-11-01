package restaurante;

import java.util.Scanner;

/**
 *
 * @author 0196611
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GarconFacade facade = new GarconFacade();
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Abrindo conta! ");
        facade.abrirConta();
                
        while(i != 4){
                    
            System.out.println("1 para pedir um Xis de 15,00 reais! ");
            System.out.println("2 para pedir uma pizza de 35, reais! ");
            System.out.println("3 para pedir uma alaminuta de 17,00 reais! ");
            System.out.println("4 para pagar a conta! ");
            i = scanner.nextInt();
                    
            if(i == 1){
                facade.pedirXis();
            }else{
                if(i == 2){
                    facade.pedirPizza();
                }else{
                    if(i == 3){
                        facade.pedirAlaminuta();
                    }else{
                        if(i == 4){
                            facade.pagarConta();
                            System.out.println("Saia já da mesa!!! ");
                        }
                    }
                }
            }
        }
    }
    
}
