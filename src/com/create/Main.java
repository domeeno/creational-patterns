package com.create;

import com.create.builder.LegoCity;
import com.create.prototype.CityHabitant;
import com.create.prototype.enums.Gender;
import com.create.singleton.connection.MySQLConnection;

import java.util.ArrayList;

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

        //Prototype
        CityHabitant cityHabitant = new CityHabitant("Dorothy", true, 23, Gender.FEMALE, legoCity);
        CityHabitant cityHabitant1 = cityHabitant.clone();
        System.out.println("Original habitant age: " + cityHabitant.getAge() + "\t|\t Cloned habitant age: " + cityHabitant1.getAge());
        System.out.println("Original habitant gender: " + cityHabitant.getGender() + "\t|\t Cloned habitant gender: " + cityHabitant1.getGender());
        System.out.println("Original habitant city: " + cityHabitant.getCityOrigin() + "\t|\t Cloned habitant city: " + cityHabitant1.getCityOrigin());
    }
}
