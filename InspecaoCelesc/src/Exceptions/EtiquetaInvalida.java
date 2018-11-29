/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author marco
 */
public class EtiquetaInvalida extends Exception{
    public EtiquetaInvalida(){
        super("A etiqueta não atende o padrão de 5 caracteres");
    }
}
