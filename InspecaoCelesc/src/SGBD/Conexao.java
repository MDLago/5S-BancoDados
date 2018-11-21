/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SGBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class Conexao {
    private static String url = "jdbc:postgresql://localhost:5432/m3_marco";
    private static String usuario = "marco";
    private static String senha = "123456";
    
    public Connection getConnection(){
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
}
