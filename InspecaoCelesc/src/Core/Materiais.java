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
public enum Materiais {
    FERRO(1),MADEIRA(2),CONCRETO(3);
    
    private int valor;

    Materiais(int valor) {
        this.valor = valor;
    }
    
    public int getValor(){
        return this.valor;
    }
}
