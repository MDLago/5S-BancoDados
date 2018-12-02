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
                "select id, etiqueta," +
"	Case" +
"	When material=1 Then 'Ferro'" +
"	When material=2 Then 'Madeira'" +
"	When material=3 Then 'Concreto'" +
"	Else 'Nao Encontrado'" +
"	End as material, latitude, longitude" +
"	from poste;";
    }
    
    public static String SQLListarInspecao(){
        return
                "select" +
"		i.id," +
"		p.etiqueta as poste," +
"		Case " +
"			when i.prumo=true then 'Possui'" +
"			Else 'Não Possui'" +
"		End as prumo," +
"		Case" +
"			when i.estado_conservacao=true then 'Adequado'" +
"			Else 'Inadequado'" +
"		End as conservacao," +
"		Case" +
"			when i.condicao_fiacao=true then 'Adequado'" +
"			else 'Inadequado'" +
"		End as fiacao," +
"		i.data as data_inspecao" +
"	from" +
"		inspecao i" +
"		inner join poste p on (i.poste_id = p.id)" +
"	order by" +
"		poste;";
    }
}
