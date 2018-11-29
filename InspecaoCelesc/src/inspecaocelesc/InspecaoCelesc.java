/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspecaocelesc;

import Interface.Principal;
import Core.*;
import SGBD.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author marco
 */
public class InspecaoCelesc {
    static public Date getData(String str){
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
        
        Principal.main(args);

    }
    
    
}
