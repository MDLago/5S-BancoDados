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
public abstract class Select {
    public static String SQLListarPoste(){
        return 
                "select * from poste";
    }
    
    public static String SQLListarInspecao(){
        return
                "select" +
"		i.id," +
"		i.prumo," +
"		i.estado_conservacao as conservacao," +
"		i.condicao_fiacao as fiacao," +
"		i.data as data_inspecao," +
"		p.etiqueta as poste" +
"	from" +
"		inspecao i" +
"		inner join poste p on (i.poste_id = p.id)" +
"	order by" +
"		poste";
    }
}
