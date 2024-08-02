package com.example.crudCapacitacionApx.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {

    //**FALTA COLOCAR LAS VARIABLES DE ENTORNO
    private static String url = "jdbc:mysql://localhost:3306/myschool?serverTimezone=America/Merida";
    private static String username = "root";
    private static String password = "sasa";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}
