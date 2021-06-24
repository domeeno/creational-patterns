package com.create;

import com.create.builder.LegoCity;
import com.create.singleton.connection.MySQLConnection;

public class Main {

    public static void main(String[] args) {
        //Singleton
        MySQLConnection instance = MySQLConnection.getInstance();

        //Builder
        LegoCity.Builder builder = new LegoCity.Builder();

        builder.institutions("Parliament").parks("Stefan the Great").shops("Nirvana").shops("Crafti");

        LegoCity legoCity = builder.build();

        System.out.println(legoCity.getInstitutions());
        System.out.println(legoCity.getShops());
        System.out.println(legoCity.getTheaters());
    }
}
