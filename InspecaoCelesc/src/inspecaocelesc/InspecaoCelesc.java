/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspecaocelesc;

import Core.Inspecao;
import Exceptions.DataInvalida;
import Interface.Principal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Vector;

/**
 *
 * @author marco
 */
public class InspecaoCelesc {
    static public Date getData(String str) throws DataInvalida{
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateTime = LocalDate.parse(str, formatter);
            Date a = java.sql.Date.valueOf(dateTime);
            return a;
        }catch (Exception e){
            throw new DataInvalida();
        }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection con = null;
        try {
            con = SGBD.Conexao.getConnection();
        } catch (Exception e) {
            
        }
        
        Vector<ResultSet> rs=null;
        
        try{
            rs = Inspecao.getPostesSemInspecao(con, 6, 2018, 12, 2018);
        }catch (Exception e){
            
        }
         
        for (ResultSet r : rs) {
            try{
                while(r.next()){
                    System.out.println(r.getString(1));
                }
            }catch(Exception e){
                
            }
        }
        //Principal.main(args);

    }
    
    
}
