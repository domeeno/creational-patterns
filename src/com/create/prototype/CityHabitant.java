package com.create.prototype;

import com.create.builder.LegoCity;
import com.create.prototype.enums.Gender;

import java.util.ArrayList;

public class CityHabitant implements Cloneable{
    private String name;
    private Boolean isEmployed;
    private int age;
    private Gender gender;
    private LegoCity cityOrigin;

    public CityHabitant(String name, Boolean isEmployed, int age, Gender gender, LegoCity cityOrigin) {
        this.name = name;
        this.isEmployed = isEmployed;
        this.age = age;
        this.gender = gender;
        this.cityOrigin = cityOrigin;
    }

    public CityHabitant() {
    }

    public CityHabitant clone()  {
        try {
            return (CityHabitant) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
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

    public LegoCity getCityOrigin() {
        return cityOrigin;
    }

    public void setCityOrigin(LegoCity cityOrigin) {
        this.cityOrigin = cityOrigin;
    }
}
