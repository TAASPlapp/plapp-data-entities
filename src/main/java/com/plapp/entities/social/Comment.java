package com.plapp.entities.social;

public class Comment {
    private UserDetails author;
    private String content;
    private long storyboardId;
    private long storyboardItemId;

    public UserDetails getAuthor() {
        return author;
    }

    public void setAuthor(UserDetails author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getStoryboardId() {
        return storyboardId;
    }

    public void setStoryboardId(long storyboardId) {
        this.storyboardId = storyboardId;
    }

    public long getStoryboardItemId() {
        return storyboardItemId;
    }

    public void setStoryboardItemId(long storyboardItemId) {
        this.storyboardItemId = storyboardItemId;
    }
}
