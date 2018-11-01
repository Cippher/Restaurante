package restaurante;

/**
 *
 * @author 0196611
 */
public class GarconFacade {
    
    Cozinha cozinha;
    Caixa caixa;
    
    GarconFacade(){
    cozinha = new Cozinha();
    caixa = new Caixa(); 
    }
    
    public void pedirXis(){
        System.out.println("");
        cozinha.fazerXis();
    }
    
    public void pedirPizza(){
        System.out.println("");
        cozinha.fazerPizza();
    }
    
    public void pedirAlaminuta(){
        System.out.println("");
        cozinha.fazerAlaminuta();
    }
    
    public void pagarConta(){
        System.out.println("");
        caixa.pagarConta();
    }
    
    public void abrirConta(){
        System.out.println("");
        caixa.abrirConta();
    }
    
    public void calculaConta(){
        //implementar
    }
    
}
