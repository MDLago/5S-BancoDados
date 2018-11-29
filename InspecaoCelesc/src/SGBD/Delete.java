/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGBD;

/**
 *
 * @author marco
 */
public abstract class Delete {
    public static String SQLApagarPosteID(){
        return 
                "Delete from poste"
                + " where id = ?";
    }
    public static String SQLApagarPosteEtiqueta(){
        return 
                "Delete from poste"
                + " where etiqueta = ?";
    }
    
    public static String SQLApagarInspecao(){
        return
                "Delete from inspecao"
                +" where id = ?";
    }
}
