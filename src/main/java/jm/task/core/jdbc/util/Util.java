package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/schemausers";
   //         "jdbc:mysql://localhost:3306/1.1.4?useUnicode=true&characterEncoding=utf8";
  //
    private static final String userName = "root";
    private static final String password = "4797033Dd";

    public static Connection getConnection () {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL,userName,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
