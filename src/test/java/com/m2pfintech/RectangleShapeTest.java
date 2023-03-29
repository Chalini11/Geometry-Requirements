package com.m2pfintech;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static com.m2pfintech.RectangleShape.createSquare;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleShapeTest
{
    RectangleShape rectangleObject2x10 = new RectangleShape(2,10);
    RectangleShape rectangleObjectNegative = new RectangleShape(-2,-2);
    RectangleShape squareObject = createSquare(2);
    RectangleShape squareObjectNegative = createSquare(-2);
    @Nested
    class RectangleArea {
        @Test
        void toReturnAreaValueTwentyWhenGivenInputsTwoAndTen() {
            int expectedValue = 20;

            int actualValue = rectangleObject2x10.area();

            assertEquals(expectedValue, actualValue);
        }

        @Test
        void toThrowExceptionWhenEitherOfInputsAreNegativeWhileFindingArea() {
            assertThrows(IllegalArgumentException.class, () -> rectangleObjectNegative.area());
        }

    }

    @Nested
    class RectanglePerimeter
    {
        @Test
        void toReturnPerimeterValueTwentyFourWhenGivenInputsTwoAndTen() {
            int expectedValue = 24;

            int actualValue = rectangleObject2x10.perimeter();

            assertEquals(expectedValue, actualValue);
        }

        @Test
        void toThrowExceptionWhenEitherOfInputsAreNegativeWhileFindingPerimeter() {
            assertThrows(IllegalArgumentException.class, () -> rectangleObjectNegative.perimeter());
        }
    }

    @Nested
    class SquareArea
    {
        @Test
        void toReturnAreaValueFourWhenGivenInputTwo() {
            int expectedValue = 4;

            int actualValue = squareObject.area();

            assertEquals(expectedValue, actualValue);
        }

        @Test
        void toThrowExceptionWhenInputsIsNegativeWhileFindingArea() {
            assertThrows(IllegalArgumentException.class, () -> squareObjectNegative.area());
        }

        @Nested

        class SquarePerimeter
        {
            @Test
            void toReturnAreaValueFourWhenGivenInputTwo() {
                int expectedValue = 8;

                int actualValue = squareObject.perimeter();

                assertEquals(expectedValue, actualValue);
            }

            @Test
            void toThrowExceptionWhenInputsIsNegativeWhileFindingArea() {
                assertThrows(IllegalArgumentException.class, () -> squareObjectNegative.perimeter());
            }
        }

    }
}
