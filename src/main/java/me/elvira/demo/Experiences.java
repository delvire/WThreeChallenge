package me.elvira.demo;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Experiences {
    @Id
    @NotEmpty
    //@Size(min=2, max=200)
    private String position;

    @NotEmpty
    //@Size(min=2, max=200)
    private String organisation;

    @NotEmpty
    //@Size(min=7, max=7)
    private String startdate;

    @NotEmpty
    //@Size(min=7, max=7)
    private String enddate;

    @NotEmpty
    //@Size(min=2, max=200)
    private String duty1;

    @NotEmpty
    //@Size(min=2, max=200)
    private String duty2;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getDuty1() {
        return duty1;
    }

    public void setDuty1(String duty1) {
        this.duty1 = duty1;
    }

    public String getDuty2() {
        return duty2;
    }

    public void setDuty2(String duty2) {
        this.duty2 = duty2;
    }
}