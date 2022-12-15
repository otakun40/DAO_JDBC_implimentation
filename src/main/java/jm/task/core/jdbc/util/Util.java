package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/my_db";
    private static final String USER = "root";
    private static final String PASSWORD = "dell1525";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (SQLException e) {
            System.out.println("Connection refuse");
            throw new RuntimeException(e);
        }
    }
}
