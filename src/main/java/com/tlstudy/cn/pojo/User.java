package com.tlstudy.cn.pojo;



public class User {
    private String acc;
    private String pwd;
    private String phone;
    private String email;

    public User(String acc, String pwd, String phone, String email) {
        this.acc = acc;
        this.pwd = pwd;
        this.phone = phone;
        this.email = email;
    }

    public User() {
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "acc='" + acc + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
