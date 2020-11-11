package com.create.connection;

public class MySQLConnection {
    private static volatile MySQLConnection instance = null;

    private MySQLConnection () {
        if(instance != null) {
            throw new RuntimeException("Instance of DB is already running");
        }
    }

    public static MySQLConnection getInstance() {
        if(instance == null) {
            synchronized (MySQLConnection.class) {
                if(instance == null) {
                    instance = new MySQLConnection();
                }
            }
        }

        return instance;
    }
}
