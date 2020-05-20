/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.AtomAluguel.ModuloConexao;

import java.sql.*;

/**
 *
 * @author Angela
 */
public class Dal {

    public static Connection conector() {

        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/aluguel";
        String user = "root";
        String pass = "vertrigo";

        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,pass);
            return conexao;
        } catch (Exception e) {
            return null;
        }

    }
}
