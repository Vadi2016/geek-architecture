package com.geek.homework.lesson6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {


    private String user;
    private String password;
    private String url;
    private String driver;


    private Connection con;

    private static volatile ConnectionFactory instance = null;

    public static ConnectionFactory getInstance() {
        if (instance == null) {
            synchronized (ConnectionFactory.class) {
                if (instance == null) {
                    instance = new ConnectionFactory();
                }
            }
        }
        return instance;
    }

    private ConnectionFactory() {
        this.user = "dbConnection.user";
        this.password = "dbConnection.password";
        this.url = "dbConnection.url";
        this.driver = "dbConnection.driver";
    }

    private ConnectionFactory(String user, String password, String url, String driver) {
        this.user = user;
        this.password = password;
        this.url = url;
        this.driver = driver;
    }

    public Connection getConnection() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}
