package com.m2pfintech;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleShapeTest
{
    RectangleShape rectangleObject = new RectangleShape();
    RectangleShape squareObject = new RectangleShape();
    @Nested
    class RectangleArea {
        @Test
        void toReturnAreaValueTwentyWhenGivenInputsTwoAndTen() {
            int expectedValue = 20;

            int actualValue = rectangleObject.area(2, 10);

            assertEquals(expectedValue, actualValue);
        }

        @Test
        void toThrowExceptionWhenEitherOfInputsAreNegativeWhileFindingArea() {
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
        void toThrowExceptionWhenEitherOfInputsAreNegativeWhileFindingPerimeter() {
            assertThrows(IllegalArgumentException.class, () -> rectangleObject.perimeter(-2, -2));
        }
    }

    @Nested
    class SquareArea
    {
        @Test
        void toReturnAreaValueFourWhenGivenInputTwo() {
            int expectedValue = 4;

            int actualValue = squareObject.area(2);

            assertEquals(expectedValue, actualValue);
        }

        @Test
        void toThrowExceptionWhenInputsIsNegativeWhileFindingArea() {
            assertThrows(IllegalArgumentException.class, () -> squareObject.area(-2));
        }

        @Nested

        class SquarePerimeter
        {
            @Test
            void toReturnAreaValueFourWhenGivenInputTwo() {
                int expectedValue = 8;

                int actualValue = squareObject.perimeter(2);

                assertEquals(expectedValue, actualValue);
            }

            @Test
            void toThrowExceptionWhenInputsIsNegativeWhileFindingArea() {
                assertThrows(IllegalArgumentException.class, () -> squareObject.perimeter(-2));
            }
        }

    }
}
