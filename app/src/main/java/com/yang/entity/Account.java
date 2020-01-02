package com.yang.entity;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Account {

    @PrimaryKey(autoGenerate = true)
    private long id_;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    private String dept;

    private String account;

    private String pwd;

    private String des;




    public Account( String type, String dept, String account, String pwd, String des) {
        this.type=type;
        this.dept = dept;
        this.account = account;
        this.pwd = pwd;
        this.des = des;
    }


    public Account() {
    }

    public long getId_() {
        return this.id_;
    }

    public void setId_(long id_) {
        this.id_ = id_;
    }

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return this.pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDes() {
        return this.des;
    }

    public void setDes(String des) {
        this.des = des;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id_=" + id_ +
                ", type='" + type + '\'' +
                ", dept='" + dept + '\'' +
                ", account='" + account + '\'' +
                ", pwd='" + pwd + '\'' +
                ", des='" + des + '\'' +
                '}';
    }
}
