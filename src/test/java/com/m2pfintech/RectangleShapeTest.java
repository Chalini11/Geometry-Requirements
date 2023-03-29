package com.m2pfintech;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleShapeTest
{
    RectangleShape rectangleObject = new RectangleShape();

    @Nested
    class RectangleArea {
        @Test
        void toReturnAreaValueTwentyWhenGivenInputsTwoAndTen() {
            int expectedValue = 20;

            int actualValue = rectangleObject.area(2, 10);

            assertEquals(expectedValue, actualValue);
        }

        @Test
        void toThrowExceptionWhenEitherOfInputsAreNegative() {
            assertThrows(IllegalArgumentException.class, () -> rectangleObject.area(-2, -2));
        }

    }

    @Nested
    class RectanglePerimeter
    {
        @Test
        void toReturnPerimeterValueTwentyFourWhenGivenInputsTwoAndTen() {
            int expectedValue = 24;

            int actualValue = rectangleObject.perimeter(2, 10);

            assertEquals(expectedValue, actualValue);
        }

        @Test
        void toThrowExceptionWhenEitherOfInputsAreNegative() {
            assertThrows(IllegalArgumentException.class, () -> rectangleObject.area(-2, -2));
        }
    }
}
