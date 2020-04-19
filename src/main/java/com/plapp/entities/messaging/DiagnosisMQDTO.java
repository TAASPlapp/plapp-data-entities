package com.plapp.entities.messaging;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.plapp.entities.greenhouse.Plant;

import java.io.Serializable;

public class DiagnosisMQDTO implements Serializable {

    @JsonUnwrapped
    private Plant plant;
    private String disease;

    public DiagnosisMQDTO(Plant plant, String disease) {
        this.plant = plant;
        this.disease = disease;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "DiagnosisMQDTO{" +
                "plant=" + plant +
                ", disease='" + disease + '\'' +
                '}';
    }
}
