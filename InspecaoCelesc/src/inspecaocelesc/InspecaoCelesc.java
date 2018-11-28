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
import java.sql.ResultSet;
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
        
        Inspecao teste = new Inspecao();
        String data = "12/11/2018";
        
        try {
            teste.apagarInspecao(con, 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
