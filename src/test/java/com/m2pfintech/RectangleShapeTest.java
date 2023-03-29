package com.m2pfintech;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleShapeTest
{
    RectangleShape rectangleObject = new RectangleShape();

    @Test

    void ToReturnTwentyWhenGivenInputsTwoAndTen()
    {
        int expectedValue = 20;

        int actualValue = rectangleObject.area(2,10);

        assertEquals(expectedValue,actualValue);
    }
    @Test
    void toThrowExceptionWhenEitherOfValuesNegative()
    {
        assertThrows(IllegalArgumentException.class,() -> rectangleObject.area(-2,-2));
    }


}
