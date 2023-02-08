package com.mvcweb_con.subclass;

import java.util.ArrayList;

public class Coordinate {
    private ArrayList<String> x;
    private ArrayList<Integer> y;

    public Coordinate() {
        this.x = new ArrayList<String>();
        this.y = new ArrayList<Integer>();
    }

    public ArrayList<String> getX() {
        return x;
    }

    public void setX(ArrayList<String> x) {
        this.x = x;
    }

    public ArrayList<Integer> getY() {
        return y;
    }

    public void setY(ArrayList<Integer> y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void insertX(String xn){
        //Integer xInt = new Integer(xn);
        this.x.add(xn);
    }

    public void insertY(int yn){
        Integer yInt = new Integer(yn);
        this.y.add(yInt);
    }
}
