package com.plapp.entities.social;

import java.util.Date;

public class UserDetails {
    private long userId;
    private String username;
    private String firstName;
    private String lastName;
    private String bio;
    private Date birthdate;
    private String profilePicture;

    public UserDetails() {

    }

    public UserDetails(long userId) {
        this.userId = userId;
    }

    public UserDetails(long userId, String username, String firstName,
                       String lastName, String bio, Date birthdate,
                       String profilePicture) {
        this.userId = userId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.birthdate = birthdate;
        this.profilePicture = profilePicture;
    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bio='" + bio + '\'' +
                ", birthdate=" + birthdate +
                ", profilePicture='" + profilePicture + '\'' +
                '}';
    }
}
