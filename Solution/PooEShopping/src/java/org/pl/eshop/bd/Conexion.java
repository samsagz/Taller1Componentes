/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pl.eshop.bd;

//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
//import com.mysql.jdbc.Driver;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.pl.eshop.general.Config;

public class Conexion {

    private static final String SERVIDOR = Config.SERVIDOR;
    private static final int PUERTO = Config.PUERTO;
    private static final String BD = Config.BD;
    private static final String TIME_ZONE = Config.TIME_ZONE;
    private static final String SSL_MODE = Config.SSL_MODE;

    private static final String NOMBRE_USUARIO = Config.NOMBRE_USUARIO;
    private static final String CONTRASENA_USUARIO
            = Config.CONTRASENA_USUARIO;
    private static final String URL = Config.getURL();

    public static Connection getConexion() throws SQLException {

        MysqlDataSource ds = new MysqlDataSource();
        ds.setServerName(SERVIDOR);
        ds.setPortNumber(PUERTO);
        ds.setDatabaseName(BD);
        ds.setUser(NOMBRE_USUARIO);
        ds.setPassword(CONTRASENA_USUARIO);
        ds.setSslMode(SSL_MODE);
        ds.setServerTimezone(TIME_ZONE);

        return ds.getConnection();

//Class.forName(SERVIDOR)
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return DriverManager.getConnection(URL, NOMBRE_USUARIO, CONTRASENA_USUARIO);
    }

}
