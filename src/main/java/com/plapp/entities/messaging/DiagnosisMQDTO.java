package com.plapp.entities.messaging;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.plapp.entities.greenhouse.Plant;

public class DiagnosisMQDTO {

    private long userId;
    @JsonUnwrapped
    private Plant plant;
    private boolean ill;
    private String disease;

    public DiagnosisMQDTO(long userId, Plant plant, boolean ill, String disease) {
        this.userId = userId;
        this.plant = plant;
        this.ill = ill;
        this.disease = disease;
    }

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

    public boolean isIll() {
        return ill;
    }

    public void setIll(boolean ill) {
        this.ill = ill;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
