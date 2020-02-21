package com.plapp.entities.social;

public class Comment {
    private long userId;
    private String content;
    private long storyboardId;
    private long storyboardItemId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
