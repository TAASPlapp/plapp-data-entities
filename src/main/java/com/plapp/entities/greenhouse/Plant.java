package com.plapp.entities.greenhouse;


import java.io.Serializable;
import java.util.Objects;

public class Plant implements Serializable{
    public enum PlantHealthStatus { HEALTHY, SICK };

    private long id;
    private long owner;
    private String name;
    private String description;
    private String type;
    private PlantHealthStatus status;
    private String image;

    public Plant() {

    }

    public Plant(long id) {
        this.id = id;
    }

    public Plant(long id, long owner, String name,
                 String description, String type,
                 PlantHealthStatus status, String image) {
        this.id = id;
        this.owner = owner;
        this.name = name;
        this.description = description;
        this.type = type;
        this.status = status;
        this.image = image;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOwner() {
        return owner;
    }

    public void setOwner(long owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PlantHealthStatus getStatus() {
        return status;
    }

    public void setStatus(PlantHealthStatus status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return id == plant.id &&
                owner == plant.owner &&
                Objects.equals(name, plant.name) &&
                Objects.equals(description, plant.description) &&
                Objects.equals(type, plant.type) &&
                status == plant.status &&
                Objects.equals(image, plant.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, owner, name, description, type, status, image);
    }
}
