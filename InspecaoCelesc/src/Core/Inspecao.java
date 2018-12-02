/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Core;

import static Core.Poste.listarPoste;
import Exceptions.*;
import SGBD.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author marco
 */
public class Inspecao {
    public static void InserirInspecao(Connection con, boolean prumo, boolean conservacao, boolean fiacao, Date data,int posteID) throws SQLException{
        String sql = Insert.SQLInserirInspecaoPosteID();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        pstm.setBoolean(1, prumo);
        pstm.setBoolean(2, conservacao);
        pstm.setBoolean(3, fiacao);
        pstm.setDate(4, data);
        pstm.setInt(5, posteID);
        
        pstm.executeUpdate();
    }

    public static void InserirInspecao(Connection con, boolean prumo, boolean conservacao, boolean fiacao, Date data,String posteEtiqueta) throws SQLException, EtiquetaInvalida{
        
        if(posteEtiqueta.length() != 5){
            throw new EtiquetaInvalida();
        }
        
        String sql = Insert.SQLInserirInspecaoPosteEtiqueta();
        PreparedStatement pstm = con.prepareStatement(sql);
        
        pstm.setBoolean(1, prumo);
        pstm.setBoolean(2, conservacao);
        pstm.setBoolean(3, fiacao);
        pstm.setDate(4, data);
        pstm.setString(5, posteEtiqueta);
        
        pstm.executeUpdate();
    }
     
     public static void apagarInspecao(Connection con, int id) throws SQLException, DadoNaoEncontrado{
         String sql = Delete.SQLApagarInspecao();
         PreparedStatement pstm = con.prepareStatement(sql);
         int retorno;
         
         pstm.setInt(1,id);
         
         retorno = pstm.executeUpdate();
         
         if(retorno == 0){
            throw new DadoNaoEncontrado();
        }
     }
     
     public static ResultSet listarInspecao(Connection con) throws SQLException{
         String sql = Select.SQLListarInspecao();
         PreparedStatement pstm = con.prepareStatement(sql);
         
         ResultSet rs = pstm.executeQuery();
         
         return rs;
     }
     
       public static TableModel getTableModelInspecao(){
        Connection con = null;
        try {
            con = SGBD.Conexao.getConnection();
        } catch (Exception e) {
            return null;
        }
        
        ResultSet rs = null;
        
        try{
            rs = listarInspecao(con);
        }catch (Exception e){
            return null;
        }
        
        return DbUtils.resultSetToTableModel(rs);
     }
}
