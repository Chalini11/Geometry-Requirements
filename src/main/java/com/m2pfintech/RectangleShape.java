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


    public int area(int input)
    {
        return area(input,input);
    }

    public int perimeter(int input)
    {
        return perimeter(input,input);
    }
}

