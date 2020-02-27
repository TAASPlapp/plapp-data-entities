package com.plapp.entities.schedules;


public class Diagnosis {


    private String plantId;
    private boolean ill;
    private String disease;

    public Diagnosis(){}

    public Diagnosis(String plantId, boolean ill, String disease) {
        this.plantId = plantId;
        this.ill = ill;
        this.disease = disease;
    }


    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId;
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

    @Override
    public String toString() {
        return "Diagnosis{" +
                "plantID='" + plantId + '\'' +
                ", ill=" + ill +
                ", disease='" + disease + '\'' +
                '}';
    }
}
