/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    }
    
    public void abrirConta(){
        System.out.println("");
    }
    
}
