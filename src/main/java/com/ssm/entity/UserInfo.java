package com.ssm.entity;

public class UserInfo {
    private int userId;
    private String username;
    private String userpassword;
    private int userauthority;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getUserauthority() {
        return userauthority;
    }

    public void setUserauthority(int userauthority) {
        this.userauthority = userauthority;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", userauthor=" + userauthority +
                '}';
    }
}
