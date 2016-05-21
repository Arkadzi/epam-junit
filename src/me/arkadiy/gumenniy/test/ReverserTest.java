package me.arkadiy.gumenniy.test;

import me.arkadiy.gumenniy.modifier.Modifier;
import me.arkadiy.gumenniy.modifier.Reverser;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

/**
 * Created by Arkadiy on 21.05.2016.
 */
public class ReverserTest {

    private static Modifier reverser;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        reverser = new Reverser();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testModifyLessIllegalArgument() throws Exception {
        reverser.modify(99);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testModifyMoreIllegalArgument() throws Exception {
        reverser.modify(1000);
    }

    @org.junit.Test
    public void testModifyThreeDigit() throws Exception {
        Number number = reverser.modify(123);
        assertEquals("not 321", 321, number);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        reverser = null;
    }
}