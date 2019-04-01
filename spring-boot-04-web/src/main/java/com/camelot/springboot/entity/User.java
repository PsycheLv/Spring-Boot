package com.camelot.springboot.entity;

/**
 * @ClassName User
 * @Description TODO
 * @Author admin
 * @Date 2019/3/15 12:00
 * @Version 1.0
 */
public class User {
    private String userName;

    /**
     * 1.女生  2.男生
     */
    private Integer gender;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public User() {
    }

    public User(String userName, Integer gender) {
        this.userName = userName;
        this.gender = gender;
    }
}
