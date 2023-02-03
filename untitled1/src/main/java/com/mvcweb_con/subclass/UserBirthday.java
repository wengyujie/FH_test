package com.mvcweb_con.subclass;

import java.util.Date;

public class UserBirthday {
    private String name;
    private Date birthday;

    @Override
    public String toString() {
        return "UserBirthday{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public UserBirthday(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
