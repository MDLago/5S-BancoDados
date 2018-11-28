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
public abstract class Insert {
    public static String SQLInserirPoste(){
        return 
                "Insert into poste (etiqueta,material,latitude,longitude)"
                +" values (?,?,?,?)";
    }
    public static String SQLInserirInspecaoPosteID(){
        return
                "Insert into inspecao (prumo,estado_conservacao,condicao_fiacao,data,poste_id)" +
                " values (?,?,?,?,?)";
    }
    public static String SQLInserirInspecaoPosteEtiqueta(){
        return
                "Insert into inspecao (prumo,estado_conservacao,condicao_fiacao,data,poste_id)" +
                " values (?,?,?,?,(select id from poste where etiqueta = ?))";
    }
}
