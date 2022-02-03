package com.create.creational.prototype.repository;

import com.create.creational.prototype.abstracts.CityHabitant;
import com.create.creational.prototype.citizen.FireFighter;
import com.create.creational.prototype.citizen.Teacher;
import com.create.creational.prototype.enums.Gender;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, CityHabitant> habitants = new HashMap<String, CityHabitant>();

    public Registry() {
        loadItems();
    }

    public CityHabitant hireHabitant (String type) {
        CityHabitant habitant = null;
        try {
            habitant = (CityHabitant)(habitants.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return habitant;
    }

    private void loadItems() {
        FireFighter fireFighter = new FireFighter();
        fireFighter.setFirstName("Michael");
        fireFighter.setFirstName("Jackson");
        fireFighter.setAge(32);
        fireFighter.setGender(Gender.MALE);
        fireFighter.setFiresExtinguished(3);
        habitants.put("FireFighter", fireFighter);

        Teacher teacher = new Teacher();
        teacher.setFirstName("Billie");
        teacher.setLastName("Jean");
        teacher.setAge(35);
        teacher.setGender(Gender.FEMALE);
        habitants.put("Teacher", teacher);
    }


}
