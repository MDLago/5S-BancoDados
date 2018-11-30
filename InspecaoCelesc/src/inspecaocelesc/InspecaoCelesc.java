/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspecaocelesc;

import Exceptions.DataInvalida;
import Interface.Principal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
        
        Principal.main(args);

    }
    
    
}
