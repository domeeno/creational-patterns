package com.create.prototype.repository;

import com.create.prototype.abstracts.CityHabitant;
import com.create.prototype.citizen.FireFighter;
import com.create.prototype.citizen.Teacher;
import com.create.prototype.enums.Gender;

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
        fireFighter.setName("Michael");
        fireFighter.setAge(32);
        fireFighter.setGender(Gender.MALE);
        fireFighter.setFiresExtinguished(3);
        habitants.put("FireFighter", fireFighter);

        Teacher teacher = new Teacher();
        teacher.setName("Dorothy");
        teacher.setAge(35);
        teacher.setGender(Gender.FEMALE);
        habitants.put("Teacher", teacher);
    }


}
