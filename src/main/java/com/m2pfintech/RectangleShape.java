package com.m2pfintech;

public class RectangleShape {
    public int area(int length, int breadth)
    {
        if(length < 0 || breadth < 0)
            throw new IllegalArgumentException();
        return length*breadth;

    }

    public int perimeter(int length, int breadth)
    {
        if(length < 0 || breadth < 0)
            throw new IllegalArgumentException();
        return 2*(length+breadth);
    }
}

