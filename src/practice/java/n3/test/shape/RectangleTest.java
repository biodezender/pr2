package practice.java.n3.test.shape;

import org.junit.Before;
import org.junit.Test;
import practice.java.n3.main.shape.Rectangle;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(1, 5);
    }

    @Test
    public void getAreaMethodTest() {
        double expectedResult = 5;
        assertEquals(expectedResult, rectangle.getArea(), 0.0000001);
    }

    @Test
    public void getPerimeterMethodTest() {
        double expectedResult = 12;
        assertEquals(expectedResult, rectangle.getPerimeter(), 0.0000001);
    }
}