package com.create.creational.prototype.citizen;

import com.create.creational.prototype.abstracts.CityHabitant;

public class FireFighter extends CityHabitant {
    private Integer firesExtinguished;

    public Integer getFiresExtinguished() {
        return firesExtinguished;
    }

    public void setFiresExtinguished(Integer firesExtinguished) {
        this.firesExtinguished = firesExtinguished;
    }
}
