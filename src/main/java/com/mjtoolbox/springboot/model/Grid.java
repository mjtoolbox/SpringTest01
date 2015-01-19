package com.mjtoolbox.springboot.model;

/**
 * Created by msjo on 1/10/2015.
 */
public class Grid {
    private String type;
    private int length;
    private int height;

    public Grid(String type, int length, int height) {
        this.type = type;
        this.length = length;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
