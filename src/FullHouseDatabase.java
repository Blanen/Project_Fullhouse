/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;

/**
 *
 * @author Babita
 */
public class FullHouseDatabase {
    private static final String dbserver="localhost";
    private static final String database="fullhouse";
    private static final String username="admin";
    private static final String password="admin";
    private static Connection activeConnection;
    
    
    public static void init()
    {
        try{
            String driver="com.mysql.jdbc.Driver";
            Class.forName(driver);
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        
        
    }
    public static Connection getConnection() throws SQLException
    {
        init();
        activeConnection=createConnection();
        return activeConnection;
    }
    private static Connection createConnection() throws SQLException
    {
	try{Class.forName("com.mysql.jdbc.Driver");
	}
	catch(Exception a){
		System.out.println(a);
	}
        String connectionString="jdbc:mysql://" + dbserver + "/" + database	 + "?user=" + username + "&password=" + password;
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        return DriverManager.getConnection(connectionString);
    }
}
