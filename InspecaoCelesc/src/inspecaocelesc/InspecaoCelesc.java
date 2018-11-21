/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspecaocelesc;

import SGBD.Conexao;
import java.sql.Connection;

/**
 *
 * @author marco
 */
public class InspecaoCelesc {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = new Conexao().getConnection();
  
    }
    
}
