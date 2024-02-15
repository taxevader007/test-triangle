package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    private Triangle triangle;

    public void TriangleTest1() {
        triangle = new Triangle(2, 2, 2);
    }

    public void TriangleTest2() {triangle = new Triangle(2,2,4); }

    public void TriangleTest3() {triangle = new Triangle( 2, 4 ,3); }

    public void TriangleTest4(){triangle = new Triangle(0,3,2);}

    @Test
    public void testWhatType() {
        TriangleTest1();
        Assertions.assertEquals("Equilateral", triangle.whatType(), "is not equilateral");

    }

    @Test
    public void testWhatType2(){
        TriangleTest2();
        Assertions.assertEquals("Isosceles", triangle.whatType(), "is not isoseles");
    }

    @Test
    public void testWhatType3(){
        TriangleTest3();
        Assertions.assertEquals("Scalene", triangle.whatType(), "is not scalene");
    }

    @Test
    public void testWhatType4(){
        TriangleTest4();
        Assertions.assertEquals("Invalid", triangle.whatType(), "is not Invalid");
    }


}
