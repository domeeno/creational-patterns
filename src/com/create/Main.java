package com.create;

import com.create.builder.LegoCity;
import com.create.prototype.citizen.Teacher;
import com.create.prototype.repository.Registry;
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

        //Prototype
        Registry registry = new Registry();
        Teacher teacher = (Teacher) registry.hireHabitant("Teacher");
        teacher.setEmployed(true);
        teacher.setCourse("Mathematics");
        teacher.setEducation("pHd");
        teacher.setAge(21);

        Teacher anotherTeacher = (Teacher) registry.hireHabitant("Teacher");
        anotherTeacher.setCourse("Informatics");
        anotherTeacher.setCourse("Master's Degree");
        anotherTeacher.setEmployed(false);

        System.out.println("Original teacher reference: " + teacher + "\t|\t Another teacher reference: " + anotherTeacher);
        System.out.println("Original teacher age: " + teacher.getAge() + "\t|\t Another teacher age: " + anotherTeacher.getAge());
        System.out.println("Original teacher gender: " + teacher.getGender() + "\t|\t Another teacher gender: " + anotherTeacher.getGender());
        System.out.println("Original teacher course: " + teacher.getCourse() + "\t|\t Another teacher gender: " + anotherTeacher.getCourse());
        System.out.println("Original teacher employment: " + teacher.getEmployed() + "\t|\t Another teacher employment: " + anotherTeacher.getEmployed());
        System.out.println("Original teacher education: " + teacher.getEducation() + "\t|\t Another teacher education: " + anotherTeacher.getEducation());
    }
}
