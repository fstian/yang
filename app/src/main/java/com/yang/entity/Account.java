package com.yang.entity;


import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(value={"uuid"},unique = true)})
public class Account {
//主键于业务无光
    @PrimaryKey(autoGenerate = true)
    private long id_;

    private String type;

    private String dept;

    private String account;

    private String pwd;

    private String des;

    private String uuid;


    public Account( String type, String dept, String account, String pwd, String des,String uuid) {
        this.type=type;
        this.dept = dept;
        this.account = account;
        this.pwd = pwd;
        this.des = des;
        this.uuid=uuid;

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
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
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
