/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pl.eshop.general;

public class Config {

    public static final String SERVIDOR = "localhost";//"127.0.0.1";
    public static final int PUERTO = 3306;
    public static final String BD = "tienda";
    public static final String NOMBRE_USUARIO = "root";
    public static final String CONTRASENA_USUARIO = "root";    
    public static final String TIME_ZONE = "UTC";
    public static final String SSL_MODE = "DISABLED";


    public static final String getURL() {
        return "jdbc:mysql://" + SERVIDOR + ":" + PUERTO + "/" + BD + "?useSSL=false";
    }
}
