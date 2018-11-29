/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import SGBD.Delete;
import SGBD.Insert;
import SGBD.Select;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class Inspecao {
    public void InserirInspecao(Connection con, boolean prumo, boolean conservacao, boolean fiacao, Date data,int posteID) throws SQLException{
        String sql = Insert.SQLInserirInspecaoPosteID();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        pstm.setBoolean(1, prumo);
        pstm.setBoolean(2, conservacao);
        pstm.setBoolean(3, fiacao);
        pstm.setDate(4, data);
        pstm.setInt(5, posteID);
        
        pstm.executeUpdate();
    }

    public void InserirInspecao(Connection con, boolean prumo, boolean conservacao, boolean fiacao, Date data,String posteEtiqueta) throws SQLException{
        String sql = Insert.SQLInserirInspecaoPosteEtiqueta();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        pstm.setBoolean(1, prumo);
        pstm.setBoolean(2, conservacao);
        pstm.setBoolean(3, fiacao);
        pstm.setDate(4, data);
        pstm.setString(5, posteEtiqueta);
        
        pstm.executeUpdate();
    }
    
     public void apagarPoste(Connection con, int id) throws SQLException{
        String sql = Delete.SQLApagarPosteID();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        pstm.setInt(1, id);
        
        pstm.executeUpdate();
    }
     
     public void apagarInspecao(Connection con, int id) throws SQLException{
         String sql = Delete.SQLApagarInspecao();
         PreparedStatement pstm = con.prepareStatement(sql);
         
         pstm.setInt(1,id);
         
         pstm.executeUpdate();
     }
     
     public ResultSet listarInspecao(Connection con) throws SQLException{
         String sql = Select.SQLListarInspecao();
         PreparedStatement pstm = con.prepareStatement(sql);
         
         ResultSet rs = pstm.executeQuery();
         
         return rs;
     }
}
