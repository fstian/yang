package com.yang.entity;

public class User {


    private String userName;

    private String pwd;


    public User( String userName, String pwd) {

        this.userName = userName;
        this.pwd = pwd;
    }


    public User() {
    }



    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }




}
