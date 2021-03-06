/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Babita
 */
public class FullHouseDatabase {

    private static final String dbserver = "localhost";
    private static final String database = "fullhouse";
    private static final String username = "root";
    private static final String password = "root";
    private static Connection activeConnection;

    public static void init() {
        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

    }

    public static Connection getConnection() throws SQLException {
        init();
        if (activeConnection == null) {
            activeConnection = createConnection();
        }
        return activeConnection;
    }

    private static Connection createConnection() throws SQLException {
        String connectionString = "jdbc:mysql://" + dbserver + "/" + database + "?user=" + username + "&password=" + password;

        return DriverManager.getConnection(connectionString);
    }
}
