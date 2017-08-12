package me.elvira.demo;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

@Entity
public class User {
    @Id
    @NotNull
    //@Min(1)
    private long id;

    @NotEmpty
    //@Size(min=2, max=100)
    private String name;

    @NotEmpty
    //@Size(min=5, max=100)
    private String emailaddr;

    @NotEmpty
    //@Size(min=1, max=10)
    private ArrayList<Educations> educations;

    //@Size(min=0, max=10)
    private ArrayList<Experiences> experiences;

    @NotEmpty
    //@Size(min=1, max=20)
    private ArrayList<Skills> skills;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailaddr() {
        return emailaddr;
    }

    public void setEmailaddr(String emailaddr) {
        this.emailaddr = emailaddr;
    }

    public ArrayList<Educations> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Educations> educations) {
        this.educations = educations;
    }

    public ArrayList<Experiences> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<Experiences> experiences) {
        this.experiences = experiences;
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skills> skills) {
        this.skills = skills;
    }
}