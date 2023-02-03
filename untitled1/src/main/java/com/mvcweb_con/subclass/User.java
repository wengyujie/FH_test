package com.mvcweb_con.subclass;

public class User {
    private String username;
    private String userage;

    @Override
    public String toString() {
        return "name = " + username + ", age = " + userage;
    }

    public User(String username, String userage)
    {
        this.username = username;
        this.userage = userage;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setUserage(String userage) {
        this.userage = userage;
    }

    public String getUsername() {
        return username;
    }

    public String getUserage() {
        return userage;
    }
}
