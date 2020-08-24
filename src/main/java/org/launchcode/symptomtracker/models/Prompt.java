package org.launchcode.symptomtracker.models;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Prompt extends AbstractEntity{

    @NotNull
    @Size(min=1, max=2)
    private int sleep;

    @NotNull
    @Min(1)
    @Max(10)
    private int mood;
    @NotNull
    @Min(1)
    @Max(10)
    private int anxiety;
    private String symptoms;


    public Prompt() {
    }

    // Initialize the id and value fields.
    public Prompt(int sleep, int mood, int anxiety, String symptoms) {
        super();
        this.sleep = sleep;
        this.mood = mood;
        this.anxiety = anxiety;
        this.symptoms = symptoms;

    }

    // Getters and setters.

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getAnxiety() {
        return anxiety;
    }

    public void setAnxiety(int anxiety) {
        this.anxiety = anxiety;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }


    @Override
    public String toString() {
        return "Prompt{" +
                "sleep=" + sleep +
                ", mood=" + mood +
                ", anxiety=" + anxiety +
                ", symptoms='" + symptoms + '\'' +
                '}';
    }
}
