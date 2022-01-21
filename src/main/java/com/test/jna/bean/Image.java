package com.test.jna.bean;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Image extends Structure {
/*
    struct image{
        std::string name;
        std::string pic1;
        std::string pic2;
        std::string pic3;
    };
*/

    public String name;
    public String pic1;
    public String pic2;
    public String pic3;

    public static class ByReference extends Image implements Structure.ByReference{}
    public static class ByValue extends Image implements Structure.ByValue{}

    @Override
    protected List getFieldOrder(){
        return Arrays.asList(new String[] {"name","pic1","pic2","pic3"});
    }
}
