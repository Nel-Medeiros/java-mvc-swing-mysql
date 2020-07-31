/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nel
 */
public class ConnectionMVC {
    
    public Connection getConnection() {
        Connection conn = null;
        
        //Carregar o Driver do MySql
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        //Criar a conexão com o banco
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_swing_db?useSSL=false", 
                    "root", "LumberJ@ck2004");
        }catch(SQLException ex) {
            ex.printStackTrace();
        }
        
        return conn;
    }
}
