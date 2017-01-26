package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_454 {
    private final Production84_454 production = new Production84_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}