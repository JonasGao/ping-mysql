package com.github.jonasgao.tools.testmysql;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jonas Gao
 * @since 2022/2/15
 */
public class App {
    public static void main(String[] args) throws SQLException {
        Console console = System.console();
        String url = console.readLine("Url: ");
        String username = console.readLine("Username: ");
        char[] password = console.readPassword("Password: ");
        Connection conn = DriverManager.getConnection(url, username, new String(password));
        System.out.println("Connection successful!");
        System.out.println("DATABASE NAME IS: "
                + conn.getMetaData().getDatabaseProductName());
        conn.close();
    }
}
