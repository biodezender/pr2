package practice.java.n3.test.shape;

import org.junit.Before;
import org.junit.Test;
import practice.java.n3.main.shape.Square;


import static org.junit.Assert.assertEquals;

public class SquareTest {

    private Square square;

    @Before
    public void setUp() {
        square = new Square(5);
    }

    @Test
    public void getAreaMethodTest() {
        double expectedResult = 25;
        assertEquals(expectedResult, square.getArea(), 0.0000001);
    }

    @Test
    public void getPerimeterMethodTest() {
        double expectedResult = 20;
        assertEquals(expectedResult, square.getPerimeter(), 0.0000001);
    }
}