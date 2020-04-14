package com.plapp.entities.greenhouse;

public class StoryboardItem {
    private long id;
    private long storyboardId;
    private String image;
    private String thumbImage;
    private String description;
    private String title;
    private Plant.PlantHealthStatus status;

    public StoryboardItem() {

    }

    public StoryboardItem(long id) {
        this.id = id;
    }

    public StoryboardItem(long id, long storyboardId, String image,
                          String thumbImage, String description,
                          String title, Plant.PlantHealthStatus status) {
        this.id = id;
        this.storyboardId = storyboardId;
        this.image = image;
        this.thumbImage = thumbImage;
        this.description = description;
        this.title = title;
        this.status = status;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStoryboardId() { return storyboardId; }

    public void setStoryboardId(long storyboardId) {
        this.storyboardId = storyboardId;
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

    @Override
    public String toString() {
        return "StoryboardItem{" +
                "id=" + id +
                ", storyboardId=" + storyboardId +
                ", image='" + image + '\'' +
                ", thumbImage='" + thumbImage + '\'' +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", status=" + status +
                '}';
    }
}
