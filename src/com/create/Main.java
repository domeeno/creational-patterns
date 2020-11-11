package com.create;

import com.create.connection.MySQLConnection;

public class Main {

    public static void main(String[] args) {
        MySQLConnection instance = MySQLConnection.getInstance();
        MySQLConnection instance2 = MySQLConnection.getInstance();

        System.out.println(instance);
        System.out.println(instance2);
    }
}
