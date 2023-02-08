package com.mvcweb_con.subclass;

public class CoordianteTable {
    private int id;
    private String x;
    private int y;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getX() {

        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "CoordianteTable{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
