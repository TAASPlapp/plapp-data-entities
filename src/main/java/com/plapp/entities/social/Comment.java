package com.plapp.entities.social;

import java.util.Date;

public class Comment {
    private MediaContentType mediaContentType;
    private long itemId;

    private UserDetails author;
    private String content;

    private Date publishedAt;

    public Comment(MediaContentType mediaContentType, long itemId, UserDetails author, String content) {
        this.mediaContentType = mediaContentType;
        this.itemId = itemId;
        this.author = author;
        this.content = content;
    }

    public UserDetails getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getItemId() {
        return itemId;
    }

    public MediaContentType getMediaContentType() {
        return mediaContentType;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }
}
