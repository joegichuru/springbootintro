package com.example.joseph.springbootintro.domain;

import java.util.Date;

/**
 * Created by joseph on 9/3/17.
 * Email: developergitch@outlook.com
 */
//@Entity
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fname;
    private String lname;
    private Date dob;
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
