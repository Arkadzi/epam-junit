package me.arkadiy.gumenniy.test;

import me.arkadiy.gumenniy.modifier.Logarithmer;
import me.arkadiy.gumenniy.modifier.Modifier;
import me.arkadiy.gumenniy.modifier.Reverser;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

/**
 * Created by Arkadiy on 21.05.2016.
 */
public class LogarithmerTest {

    private static Modifier logarithmer;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        logarithmer = new Logarithmer(new Reverser());
    }

    @org.junit.Test
    public void testModifyLessIllegalArgument() throws Exception {
//        logarithmer.modify()
    }


    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        logarithmer = null;
    }
}