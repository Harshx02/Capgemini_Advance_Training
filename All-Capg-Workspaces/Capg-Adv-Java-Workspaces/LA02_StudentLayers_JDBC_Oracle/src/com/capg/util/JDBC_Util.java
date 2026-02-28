package com.capg.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Util {

    public static Connection getConnection() throws Exception {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "scott";
        String password = "tiger";

        Class.forName("oracle.jdbc.driver.OracleDriver");

        return DriverManager.getConnection(url, username, password);
    }
}
