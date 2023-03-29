package com.m2pfintech;

public class RectangleShape {

    private int length,breadth;

    RectangleShape(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public int area()
    {
        if(length < 0 || breadth < 0)
            throw new IllegalArgumentException();
        return length*breadth;

    }

    public int perimeter()
    {
        if(length < 0 || breadth < 0)
            throw new IllegalArgumentException();
        return 2*(length+breadth);
    }
    public static RectangleShape createSquare(int side)
    {
        return new RectangleShape(side,side);
    }


    ;
    }


