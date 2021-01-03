package com.bahadireray.gezgin.Model;

import java.util.Date;

public class User {

    private String email,name,surname,resim,password;
    private Date dateOfBirth;
    private int user_id;

    public User() {
    }

    public User(String email, String name, String surname, String resim, String password, Date dateOfBirth, int user_id) {
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.resim = resim;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
