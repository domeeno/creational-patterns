package com.create.prototype;

import com.create.prototype.enums.Gender;

import java.util.ArrayList;

public class CityHabitant {
    private String name;
    private Boolean isEmployed;
    private int age;
    private Gender gender;

    public CityHabitant(String name, Boolean isEmployed, int age, Gender gender, ArrayList<CityHabitant> relatives) {
        this.name = name;
        this.isEmployed = isEmployed;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEmployed() {
        return isEmployed;
    }

    public void setEmployed(Boolean employed) {
        isEmployed = employed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
