package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_454 {
    private final Production26_454 production = new Production26_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}