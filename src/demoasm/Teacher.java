package demoasm;

import java.io.Serializable;

public class Teacher implements Serializable {
    private int id;
    private String name;
    private int age;
    private boolean gender;
    private String subject;
    private String position;
    private String phone;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, boolean gender, String subject, String position, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.subject = subject;
        this.position = position;
        this.phone = phone;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
