/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

/**
 *
 * @author marco
 */
public enum ValorLogico {
    
    SIM(true), NAO(false);
    
    private boolean valor;
    
    ValorLogico(boolean valor){
        this.valor = valor;             
    }
    
    public boolean getValor(){
        return this.valor;
    }
}
