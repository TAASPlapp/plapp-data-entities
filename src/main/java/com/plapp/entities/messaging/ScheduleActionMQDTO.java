package com.plapp.entities.messaging;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.plapp.entities.greenhouse.Plant;
import java.util.Date;

public class ScheduleActionMQDTO {
    private long userId;
    @JsonUnwrapped
    private Plant plant;
    private String action;
    private Date date;
    private int periodicity;
    private String additionalInfo;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
