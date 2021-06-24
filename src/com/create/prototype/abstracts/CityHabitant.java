package com.create.prototype.abstracts;

import com.create.builder.LegoCity;
import com.create.prototype.enums.Gender;

public abstract class CityHabitant implements Cloneable{
    private String name;
    private Boolean isEmployed;
    private int age;
    private Gender gender;
    private LegoCity cityOrigin;

    public Object clone() throws  CloneNotSupportedException {
        return super.clone();
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
