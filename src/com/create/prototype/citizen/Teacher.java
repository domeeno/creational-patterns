package com.create.prototype.citizen;

import com.create.prototype.abstracts.CityHabitant;

public class Teacher extends CityHabitant {
    private String course;
    private String education;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
