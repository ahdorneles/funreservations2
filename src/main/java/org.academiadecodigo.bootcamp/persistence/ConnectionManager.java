package org.academiadecodigo.bootcamp.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by codecadet on 13/03/2017.
 */
public class ConnectionManager {


    Connection connection = null;

    public Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?allowMultiQueries=true", "root", "");
            }

         } catch (SQLException ex) {
            System.out.println("Failure to connect the database: " + ex.getMessage());
        }
        return connection;
    }

    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            System.out.println("Failure to close database connections: " + ex.getMessage());
        }
    }
}
