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
public class InspecaoJaInseridaNoMesException extends Exception {
    public InspecaoJaInseridaNoMesException() {
        super("Este poste já possui uma inspeção inserida nesse mês");
    }

}
