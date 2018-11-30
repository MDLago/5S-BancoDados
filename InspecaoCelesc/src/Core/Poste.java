/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import Exceptions.EtiquetaInvalida;
import SGBD.Delete;
import SGBD.Insert;
import SGBD.Select;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class Poste {
    
    public static void inserirPoste(Connection con,String etiqueta, int material, double latitude, double longitude ) throws SQLException, EtiquetaInvalida{
        
        if(etiqueta.length() != 5){
            throw new EtiquetaInvalida();
        }
        
        String sql = Insert.SQLInserirPoste();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        pstm.setString(1, etiqueta);
        pstm.setInt(2, material);
        pstm.setDouble(3, latitude);
        pstm.setDouble(4, longitude);
        
        pstm.executeUpdate();
    }
    
    public static void apagarPoste(Connection con, int id) throws SQLException{
        String sql = Delete.SQLApagarPosteID();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        pstm.setInt(1, id);
        
        pstm.executeUpdate();
    }
     public static void apagarPoste(Connection con, String etiqueta) throws SQLException{
        String sql = Delete.SQLApagarPosteEtiqueta();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        pstm.setString(1, etiqueta);
        
        pstm.executeUpdate();
    }
     
     public static ResultSet listarPoste(Connection con) throws SQLException{
         String sql = Select.SQLListarPoste();
         PreparedStatement pstm = con.prepareStatement(sql);
         
         ResultSet rs = pstm.executeQuery();
         
         return rs;
     }
}
