package com.plapp.entities.greenhouse;

public class StoryboardItem {
    private long id;
    private String image;
    private String thumbImage;
    private String description;
    private String title;
    private Plant.PlantHealthStatus status;
    private int numLikes;

    public StoryboardItem() {

    }

    public StoryboardItem(long id) {
        this.id = id;
    }

    public StoryboardItem(long id, String image,
                          String thumbImage, String description,
                          String title, Plant.PlantHealthStatus status, int numLikes) {
        this.id = id;
        this.image = image;
        this.thumbImage = thumbImage;
        this.description = description;
        this.title = title;
        this.status = status;
        this.numLikes = numLikes;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getThumbImage() {
        return thumbImage;
    }

    public void setThumbImage(String thumbImage) {
        this.thumbImage = thumbImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Plant.PlantHealthStatus getStatus() {
        return status;
    }

    public void setStatus(Plant.PlantHealthStatus status) {
        this.status = status;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }
}
