package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_130 {
    private final Production26_130 production = new Production26_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}