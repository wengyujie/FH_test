package com.name;
import java.io.*;
import java.util.*;
public class NameTest {
    private String name;
    private String[] otherNames;

    private Map<String, String> addrss;

    public NameTest(){System.out.println("default");}

    public String getName(){return name;}

    public void setName(String name){this.name = name;}

    public void setOtherNames(String[] otherNames) {
        this.otherNames = otherNames;
    }

    public void setAddrss(Map<String, String> addrss) {
        this.addrss = addrss;
    }

    public void show()
    {
        System.out.println("name:" + name);
        for(String otherName:otherNames)
        {
            System.out.print("|"+otherName+"|\t");
        }
        System.out.println("addrss"+addrss);
    }
}
