package com.plapp.entities.greenhouse;

public class Plant {
    public enum PlantHealthStatus { HEALTHY, SICK };

    private long id;
    private long owner;
    private String name;
    private String description;
    private String type;
    private PlantHealthStatus status;
    private String image;

    public long getId() {
        return id;
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
}
