package com.plapp.entities.schedules;

import java.util.Date;

public class ScheduleAction {
    private long userId;
    private long plantId;
    private String action;
    private Date date;
    private int periodicity;


    public ScheduleAction(long plantId, Date date, String action, int periodicity) {
        this.plantId = plantId;
        this.date = date;
        this.action = action;
        this.periodicity = periodicity;
    }

    public long getUserId() { return userId; }

    public long getPlantId() {
        return plantId;
    }

    public Date getDate() {
        return date;
    }

    public String getAction() {
        return action;
    }

    public int getPeriodicity() {
        return periodicity;
    }

    @Override
    public String toString() {
        return "ScheduleAction{" +
                ", plantId=" + plantId +
                ", date=" + date +
                ", action='" + action +
                ", periodicity='" + periodicity + '\'' +
                '}';
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setPlantId(long plantId) {
        this.plantId = plantId;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }
}
