package com.create;

import com.create.singleton.connection.MySQLConnection;

public class Main {

    public static void main(String[] args) {
        MySQLConnection instance = MySQLConnection.getInstance();

    }
}
