import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Cube2Tester {

    @Test
    public void TestNoArgumentConstructorNoException() {
        Cube2 cube = new Cube2();
        assertEquals(1, cube.getSide(), "Ensure that your no argument constructor has been implemented correctly!");
    }

    @Test
    public void TestSingleArgumentConstructorNoException() {
        Cube2 cube = new Cube2(5);
        assertEquals(5, cube.getSide(), "Ensure that your single argument constructor has been implemented correctly!");
    }

    @Test
    public void TestSingleArgumentConstructorNegative() {
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ new Cube2(-1);});
    }

    @Test
    public void TestSingleArgumentConstructorZero() {
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ new Cube2(0);});
    }

    @Test
    public void TestSetterGetter() {
        Cube2 cube = new Cube2(5);
        cube.setSide(7);
        assertEquals(7, cube.getSide(), "Ensure that your getter and setter methods have been implemented correctly!");
    }

    @Test
    public void TestSetterNegative() {
        Cube2 cube = new Cube2(5);
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ cube.setSide(-1);});
    }

    @Test
    public void TestSetterZero() {
        Cube2 cube = new Cube2(5);
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ cube.setSide(0);});
    }

    @Test
    public void TestVolume() {
        Cube2 cube = new Cube2(5);
        int volume = cube.calculateVolume();
        assertEquals(125, volume, "Ensure that your calculateVolume method has been implemented correctly!");
    }

    @Test
    public void TestVolumeTwo() {
        Cube2 cube = new Cube2(7);
        int volume = cube.calculateVolume();
        assertEquals(343, volume, "Ensure that your calculateVolume method has been implemented correctly!");
    }

    @Test
    public void TestSurfaceArea() {
        Cube2 cube = new Cube2(5);
        int surfaceArea = cube.calculateSurfaceArea();
        assertEquals(150, surfaceArea, "Ensure that your calculateSurfaceArea method has been implemented correctly!");
    }

    @Test
    public void TestSurfaceAreaTwo() {
        Cube2 cube = new Cube2(7);
        int surfaceArea = cube.calculateSurfaceArea();
        assertEquals(294, surfaceArea, "Ensure that your calculateSurfaceArea method has been implemented correctly!");
    }

    @Test
    public void TestToString() {
        Cube2 cube = new Cube2(5);
        String cubeString = cube.toString();
        assertEquals("Cube{side=5, color=\"black\"}", cubeString, "Ensure that your toString method has been implemented correctly!");
    }
    @Test
    public void TestToString2() {
        Cube2 cube = new Cube2(6, "yellow");
        String cubeString = cube.toString();
        assertEquals("Cube{side=6, color=\"yellow\"}", cubeString, "Ensure that your toString method has been implemented correctly!");
    }

    @Test
    public void TestAdd() {
        Cube2 cube1 = new Cube2(5);
        Cube2 cube2 = new Cube2(12);
        Cube2 cube3 = cube1.add(cube2);
        assertEquals(13, cube3.getSide(), "Ensure that your add method has been implemented correctly!");
    }
    @Test
    public void TestAdd2() {
        Cube2 cube1 = new Cube2(5);
        Cube2 cube2 = new Cube2(11);
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ cube1.add(cube2);});
    }


    @Test
    public void TestMinus() {
        Cube2 cube1 = new Cube2(5);
        Cube2 cube2 = new Cube2(13);
        Cube2 cube3 = cube2.minus(cube1);
        assertEquals(12, cube3.getSide(), "Ensure that your minus method has been implemented correctly!");
    }
    @Test
    public void TestMinus2() {
        Cube2 cube1 = new Cube2(5);
        Cube2 cube2 = new Cube2(11);
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{ cube2.minus(cube1);});
    }

    @Test
    public void TestEquals() {
        Cube2 cube1 = new Cube2(7, "rainbow");
        Cube2 cube2 = new Cube2(7);
        Cube2 cube3 = new Cube2(9);
        Cube2 cube4 = new Cube2(7, "rainbow");
        assertTrue(cube1.equals((Cube2) cube1));
        assertFalse(cube1.equals((Cube2) cube2));
        assertFalse(cube1.equals((Cube2) cube3));
        assertTrue(cube1.equals((Cube2) cube4));
    }
}
