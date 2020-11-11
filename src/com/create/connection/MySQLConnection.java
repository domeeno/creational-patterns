package com.create.connection;

public class MySQLConnection {
    private static MySQLConnection instance = null;

    private MySQLConnection () {}

    public static MySQLConnection getInstance() {
        if(instance == null) {
            instance = new MySQLConnection();
        }

        return instance;
    }
}
