package com.plapp.entities.social;

import java.util.Date;

public class Like {
    private long id;
    private MediaContentType mediaContentType;
    private long itemId;
    private UserDetails author;
    private Date publishedAt;

    public Like(long id, MediaContentType mediaContentType, long itemId, UserDetails author, Date publishedAt) {
        this.id = id;
        this.mediaContentType = mediaContentType;
        this.itemId = itemId;
        this.author = author;
        this.publishedAt = publishedAt;
    }

    public Like(MediaContentType mediaContentType, long itemId, UserDetails author) {
        this.mediaContentType = mediaContentType;
        this.itemId = itemId;
        this.author = author;
    }

    public Like() {}

    public long getId() {
        return id;
    }

    public MediaContentType getMediaContentType() {
        return mediaContentType;
    }

    public long getItemId() {
        return itemId;
    }

    public UserDetails getAuthor() {
        return author;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMediaContentType(MediaContentType mediaContentType) {
        this.mediaContentType = mediaContentType;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public void setAuthor(UserDetails author) {
        this.author = author;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }
}
