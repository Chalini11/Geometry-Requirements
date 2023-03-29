package com.m2pfintech;

public class RectangleShape {
    public int area(int length, int breadth)
    {
        if(length < 0 || breadth < 0)
            throw new ArithmeticException();
        return length*breadth;

    }
}

