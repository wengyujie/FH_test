package com.mvcweb_con.subclass;

public class UserDB {
    private int id;
    private String name;
    private String pwd;

    @Override
    public String toString() {
        return "UserDB{" +
                "id=" + id +
                ", username='" + name + '\'' +
                ", password='" + pwd + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;
    }

    public String getPassword() {
        return pwd;
    }

    public void setPassword(String password) {
        this.pwd = password;
    }
}
