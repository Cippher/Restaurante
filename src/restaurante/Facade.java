package restaurante;

/**
 *
 * @author 0196611
 */
public class Facade {
    
    Cozinha cozinha;
    Caixa caixa;
    
    Facade(){
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
