package com.create.creational.prototype.abstracts;

import com.create.creational.builder.LegoCity;
import com.create.creational.prototype.enums.Gender;

public abstract class CityHabitant implements Cloneable{
    private String firstName;
    private String lastName;
    private Boolean isEmployed;
    private int age;
    private Gender gender;
    private LegoCity cityOrigin;

    public Object clone() throws  CloneNotSupportedException {
        return super.clone();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
