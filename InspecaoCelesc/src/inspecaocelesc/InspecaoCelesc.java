/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspecaocelesc;

import Core.*;
import SGBD.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author marco
 */
public class InspecaoCelesc {
    static private Date getData(String str){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateTime = LocalDate.parse(str, formatter);
        Date a = java.sql.Date.valueOf(dateTime);
        
        return a;
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = new Conexao().getConnection();
        Poste teste = new Poste();
        Inspecao teste2 = new Inspecao();
        String str = "13/12/2015";
        
        
        try {
            teste2.inserirInspecao(con, true, true, true, getData(str), 1);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
