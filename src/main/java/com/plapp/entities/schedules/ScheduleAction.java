package com.plapp.entities.schedules;

import java.io.Serializable;
import java.util.Date;

public class ScheduleAction implements Serializable {
    private long userId;
    private long plantId;
    private String action;
    private Date date;
    private int periodicity;
    private String additionalInfo;

    public ScheduleAction() {

    }

    public ScheduleAction(long userId, long plantId, Date date, String action, int periodicity, String additionalInfo) {
        this.userId = userId;
        this.plantId = plantId;
        this.date = date;
        this.action = action;
        this.periodicity = periodicity;
        this.additionalInfo = additionalInfo;
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

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
