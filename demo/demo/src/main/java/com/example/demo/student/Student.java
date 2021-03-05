package com.example.demo.student;

public class Student {
    private String name;
    private String ph;
    private String email;
    private  String msg;

    public Student() {
    }

    public Student(String name, String ph, String email, String msg) {
        this.name = name;
        this.ph = ph;
        this.email = email;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public String getPh() {
        return ph;
    }

    public String getEmail() {
        return email;
    }

    public String getMsg() {
        return msg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ph='" + ph + '\'' +
                ", email='" + email + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
