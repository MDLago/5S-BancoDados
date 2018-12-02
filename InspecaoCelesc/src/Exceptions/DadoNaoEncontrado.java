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
public class DadoNaoEncontrado extends Exception {
    public DadoNaoEncontrado() {
        super("Não foi encontrado o item com base no valor fornecido");
    }
}
